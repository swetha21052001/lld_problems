package LibraryManagementSystem.Entities;

public class Book implements Item {
    Integer id;
    String title;
    String authorName;
    String genre;

    public Book(Integer id, String title, String authorName, String genre) {
        this.id = id;
        this.title = title;
        this.authorName = authorName;
        this.genre = genre;
    }

    @Override
    public String getTitle() {
        return this.title;
    }

    @Override
    public String getAuthorName() {
        return this.authorName;
    }

    @Override
    public Integer getId() {
        return this.id;
    }
}
