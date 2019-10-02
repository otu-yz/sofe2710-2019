public class Book {
    private String title;
    private int id;
    private static int currID;

    public Book(String book) {
        title = book;
        id = currID;
        currID++;
    }

    public String getTitle() {
        return title;
    }
    public void setTitle(String newTitle) {
        title = newTitle;
    }
}
