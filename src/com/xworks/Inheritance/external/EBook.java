package com.xworks.Inheritance.external;

public class EBook extends Book{
    public EBook(){
        System.out.println("no arg const of Ebook");
    }@Override
    public void open(){
        System.out.println("open eBook brightness.");
    }@Override
    public void read(){
        System.out.println("read within the eBook.");
    }@Override
    public void close(){
        System.out.println("close the eBook.");
    }@Override
    public void bookmark(){
        System.out.println("bookmark text in eBook.");
    }@Override
    public void getDetails(){
        System.out.println("getDetails of eBook.");
    }
}
