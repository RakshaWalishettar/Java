package customer;
import banking.Book;

public class Member {
    public static void main(String[] args) {
        Book book = new Book();
        System.out.println("Book Title: " + book.title);
        book.showBookDetails();
    }
}
