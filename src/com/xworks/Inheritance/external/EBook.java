package com.xworks.Inheritance.external;

public class EBook extends Book{
    {
        super.open();
        System.out.println("open eBook brightness.");
    }
    {
        super.read();
        System.out.println("read within the eBook.");
    }
    {
        super.close();
        System.out.println("close the eBook.");
    }
    {
        super.bookmark();
        System.out.println("bookmark text in eBook.");
    }
    {
        super.getDetails();
        System.out.println("getDetails of eBook.");
    }
}
