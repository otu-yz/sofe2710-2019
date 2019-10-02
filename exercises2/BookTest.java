import java.util.ArrayList;

public class BookTest {
    public static void main(String[] args) {
        Book bookA = new Book("Dictionary");
        System.out.println("The book called " + bookA.getTitle() + " is created");
        bookA.setTitle("Goldfinch");
        System.out.println("The book called " + bookA.getTitle() + " is created");
        Book bookB = new Book("A Brief History of Time");
        BookList myBooks = new BookList();
        myBooks.add(bookA);
        myBooks.add(bookB);
        System.out.println(myBooks);
        bookA.setTitle("My Brilliant Friend");
        System.out.println(myBooks);

        ArrayList<String> words = new ArrayList<String>();
        String s = "hello";
        words.add(s);
        words.add("goodbye");
        System.out.println(words);
        s = s.toUpperCase();
        System.out.println(s);
        System.out.println(words);
    }
}
