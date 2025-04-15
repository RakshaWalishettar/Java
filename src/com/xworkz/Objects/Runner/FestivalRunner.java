package com.xworkz.Objects.Runner;

import com.xworkz.Objects.internal.Fan;
import com.xworkz.Objects.internal.Festival;

public class FestivalRunner {
    public static void main(String[] args) {
        Festival festival = new Festival("SpringFest", 'C', 3);
        Festival festival1=new Festival("SpringFest",'C',8);
        System.out.println(festival);

        System.out.println("the farm has:"+(festival==festival1));
        boolean same=festival.equals(festival1);
        System.out.println("both festival and festival1 are same :"+same);


        int code = festival.hashCode(); // Get the hash code from the object
        System.out.println("HashCode: " + code);
        System.out.println("Original identityHashCode: " + System.identityHashCode(festival));
    }
}
