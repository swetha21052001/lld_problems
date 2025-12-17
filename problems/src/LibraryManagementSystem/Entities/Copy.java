package LibraryManagementSystem.Entities;

import java.time.LocalDateTime;

public class Copy {
    Integer id;
    Item item;

    public Copy(Item item, Integer id){
        this.id = id;
        this.item = item;
        this.borrowedTime = null;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Item getItem() {
        return item;
    }

    public void setItem(Item item) {
        this.item = item;
    }
}
