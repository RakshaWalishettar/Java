package com.xworks.Inheritance.external;

public class Woood extends Tree{
    public void rosewood() {
        System.out.println("thre tree has wood");
    }
    public void many(Tree tree){
        tree.supportWildlife();
        tree.absorbCO2();
        tree.bearFruit();
        tree.provideShade();
        tree.growLeaves();

        if(tree instanceof Woood){
            Woood woood=(Woood) tree;
            System.out.println("the tree has rosewood");
            woood.rosewood();
        }
    }
}
