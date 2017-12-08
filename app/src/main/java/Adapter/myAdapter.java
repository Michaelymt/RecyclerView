package Adapter;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.List;

import Model.ListItems;
import e.hp.recyclerview.Details;
import e.hp.recyclerview.R;


public class myAdapter extends RecyclerView.Adapter<myAdapter.ViewHolder> {
    private Context context;
    private List<ListItems> listItems;

    public myAdapter(Context context , List listitem ){
        this.context = context;
        listItems = listitem;
    }


    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.list_row,parent,false);

        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(myAdapter.ViewHolder holder, int position) {

        ListItems item = listItems.get(position);
        holder.name.setText(item.getName());
        holder.description.setText(item.getDescription());

    }

    @Override
    public int getItemCount() {

        return listItems.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
        public TextView name;
        public TextView description;
        public ViewHolder(View itemView) {
            super(itemView);

            itemView.setOnClickListener(this);

            name = (TextView) itemView.findViewById(R.id.title);
            description = (TextView) itemView.findViewById(R.id.description);
        }

        @Override
        public void onClick(View v) {
            //get position of row tapped
            int position = getAdapterPosition();
            ListItems item = listItems.get(position);

            //to pass from this activity to other
            Intent intent;
            intent = new Intent(context, Details.class);
            intent.putExtra("name",item.getName());
            intent.putExtra("description",item.getDescription());

            context.startActivity(intent);
            // Toast.makeText(context,item.getName(),Toast.LENGTH_SHORT).show();

        }
    }
}
