package com.xworkz.Inheritance.external.Runner;

import com.xworks.Inheritance.external.Book;
import com.xworks.Inheritance.external.EBook;
import com.xworks.Inheritance.external.Subscrition;

public class ERunner {
    public static void main(String[] args){
        EBook eBook=new EBook();
        eBook.read();
        eBook.close();
        eBook.bookmark();
        eBook.getDetails();
        eBook.open();

        System.out.println("============================");
        Book book1=new Book();
        book1.read();
        book1.open();
        book1.close();
        book1.bookmark();
        book1.getDetails();

        System.out.println("===========================");
        Subscrition subscrition=new Subscrition();
        subscrition.digital(book1);
        subscrition.digital(subscrition);
    }

}
