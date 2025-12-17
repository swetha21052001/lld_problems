package LibraryManagementSystem.Services;

import LibraryManagementSystem.Entities.Copy;

import java.util.List;

public class BrowsingService {

    public List<Copy> searchByName(List<Copy> availableItems, String name){
        return availableItems.stream().filter(copy -> {
            return copy.getItem().getTitle().equals(name);
        }).toList();
    }

    public List<Copy> searchByAuthorName(List<Copy> availableItems, String authorName){
        return availableItems.stream().filter(copy -> {
            return copy.getItem().getAuthorName().equals(authorName);
        }).toList();
    }

    public List<Copy> searchById(List<Copy> availableItems, Integer id){
        return availableItems.stream().filter(copy -> {
            return copy.getItem().getId().equals(id);
        }).toList();
    }



}
