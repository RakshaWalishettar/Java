package com.xworkz.Inheritance.external.Runner;

import com.xworks.Inheritance.external.LibraryItem;
import com.xworks.Inheritance.external.Magazine;

public class MagazineRunner {
public static void main(String[] args){
    LibraryItem libraryItem=new LibraryItem();
    libraryItem.reserve();
    libraryItem.renew();
    libraryItem.getInfo();
    libraryItem.checkout();
    libraryItem.returnItem();

    System.out.println("===============================");
    Magazine magazine=new Magazine();
    magazine.returnItem();
    magazine.checkout();
    magazine.reserve();
    magazine.renew();
    magazine.getInfo();
}
}
