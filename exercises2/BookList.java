import java.util.ArrayList;

public class BookList {
    private ArrayList<Book> listOfBooks;
    public BookList() {
        listOfBooks = new ArrayList<Book>();
    }
    public boolean add(Book aBook) {
        return listOfBooks.add(aBook);
    }
    public void add(int index, Book aBook) {
        listOfBooks.add(index, aBook);
    }
    public Book getBook(int index) {
        return listOfBooks.get(index);
    }
    public String toString() {
        String str = "[";
        for (Book book : listOfBooks)
            str = str + book.getTitle() +
                    ((listOfBooks.indexOf(book) == listOfBooks.size()-1) ?
                    "]" : ", ");
        return str;
    }
}
