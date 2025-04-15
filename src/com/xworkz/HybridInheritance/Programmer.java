package com.xworkz.HybridInheritance;

public interface Programmer {
    void writeCode();
}

interface Blogger {
    void writeArticle();
}

class TechContentCreator implements Programmer, Blogger {
    public void writeCode() {
        System.out.println("Creating useful software tools");
    }

    public void writeArticle() {
        System.out.println("Writing tech blogs on latest frameworks");
    }

    public static void main(String[] args) {
        TechContentCreator tcc = new TechContentCreator();
        tcc.writeCode();
        tcc.writeArticle();
    }
}
