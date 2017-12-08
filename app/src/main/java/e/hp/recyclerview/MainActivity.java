package e.hp.recyclerview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

import Adapter.myAdapter;
import Model.ListItems;

public class MainActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    private RecyclerView.Adapter adapter;
    private List<ListItems> listItems;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recyclerID);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager( new LinearLayoutManager(this));

        listItems = new ArrayList<>();

        for (int i= 0;i<10;i++){
            ListItems item = new ListItems(
                    "Item "+ (i) ,
                    "Description " + i
            );

            listItems.add(item);
        }

        adapter = new myAdapter(this, listItems);
        recyclerView.setAdapter(adapter);

    }
}
