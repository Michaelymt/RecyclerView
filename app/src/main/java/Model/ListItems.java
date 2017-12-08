package Model;

/**
 * Created by HP on 08-12-2017.
 */

public class ListItems {

    private String name;
    private String description;

    public ListItems(String name , String description ){
        this.description = description;
        this.name = name ;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

}
