package com.xworkz.HybridInheritance;

public interface Teacher {
    void teach();
}

interface Researcher {
    void research();
}

class Professor implements Teacher, Researcher {
    public void teach() {
        System.out.println("Professor teaches computer science");
    }

    public void research() {
        System.out.println("Professor conducts AI research");
    }

    public static void main(String[] args) {
        Professor prof = new Professor();
        prof.teach();
        prof.research();
    }
}
