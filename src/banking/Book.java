package banking;


public class Book {
    public String title = "Java Programming";
    String author = "James Gosling";
    private int pages = 500;

    public void showBookDetails() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Pages: " + pages);
    }

    void showAuthor() { // Package-level method
        System.out.println("Author: " + author);
    }

    private void showPages() { // Private method
        System.out.println("Pages: " + pages);
    }
}

