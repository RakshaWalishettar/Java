package com.xworkz.Implement.runner;

import com.xworkz.Implement.external.ComparatorUser;
import com.xworkz.Implement.internal.Comparator;
import com.xworkz.Implement.internal.NumberComparator;

public class ComparatorRunner {
    public static void main(String[] args) {
        Comparator comparator = new NumberComparator();
        ComparatorUser user = new ComparatorUser(comparator);
        user.execute();
    }
}
