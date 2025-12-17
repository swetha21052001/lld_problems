package LibraryManagementSystem.Services;

import LibraryManagementSystem.Entities.Copy;
import LibraryManagementSystem.Entities.Item;
import java.util.ArrayList;
import java.util.List;

public class CopyManager {
    List<Copy> availableCopies;
    static int COPY_COUNT = 0;

    public CopyManager() {
        this.availableCopies = new ArrayList<>();
    }

    public List<Copy> getAvailableCopies() {
        return availableCopies;
    }

    private static int idGenerator(){
        COPY_COUNT +=1;
        return COPY_COUNT;
    }

    public void addCopy(Item item, int numberOfCopies){
        for(int i=0;i<numberOfCopies;i++){
            Copy copy = new Copy(item, idGenerator());
            availableCopies.add(copy);
        }
    }

    public void markCopy(Copy copy){
        if(availableCopies.contains(copy))
            availableCopies.remove(copy);
        else
            System.out.println("Copy borrowed");
    }

    public void unmarkCopy(Copy copy){
        availableCopies.add(copy);
    }
}
