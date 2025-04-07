package com.xworks.Inheritance.external;

public class Subscrition extends Book {
    public void pay() {
        System.out.println("the ebook need subscrition");
    }

    public void digital(Book book) {
        book.getDetails();
        book.open();
        book.read();
        book.bookmark();
        book.close();

        if (book instanceof Subscrition) {
            Subscrition subscrition = (Subscrition) book;
            System.out.println("the instance of the subscriton is book");
            subscrition.pay();
        }
    }
}
