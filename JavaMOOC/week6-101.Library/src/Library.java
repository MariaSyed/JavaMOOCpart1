
import java.util.ArrayList;

public class Library {

    private ArrayList<Book> library;

    public Library() {
        this.library = new ArrayList<Book>();
    }

    public void addBook(Book newBook) {
        this.library.add(newBook);
    }

    public void printBooks() {
        for (Book book : this.library) {
            System.out.println(book);
        }
    }

    public ArrayList<Book> searchByTitle(String searchedTitle) {
        ArrayList<Book> found = new ArrayList<Book>();
        for (Book book : this.library) {
            if(StringUtils.included(book.title(), searchedTitle)) {
                found.add(book);
            }
        }
        
        return found;

    }

    public ArrayList<Book> searchByPublisher(String searchedPublisher) {
        ArrayList<Book> found = new ArrayList<Book>();
        for (Book book : this.library) {
            if (StringUtils.included(book.publisher(), searchedPublisher)) {
                found.add(book);
            }
        }
        return found;
    }

    public ArrayList<Book> searchByYear(int searchedYear) {
        ArrayList<Book> found = new ArrayList<Book>();
        for (Book book : this.library) {
            if (book.year() == searchedYear) {
                found.add(book);
            }
        }

        return found;

    }
    
    

}
