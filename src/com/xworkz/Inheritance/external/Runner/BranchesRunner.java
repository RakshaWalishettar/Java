package com.xworkz.Inheritance.external.Runner;

import com.xworks.Inheritance.external.Branches;
import com.xworks.Inheritance.external.Tree;

public class BranchesRunner {
    public static void main(String[] args) {
        Tree tree1 = new Tree();
        tree1.provideShade();
        tree1.growLeaves();
        tree1.bearFruit();
        tree1.absorbCO2();
        tree1.supportWildlife();

        System.out.println("=====================");

        Branches branches=new Branches();
        branches.absorbCO2();
        branches.bearFruit();
        branches.growLeaves();
        branches.provideShade();
        branches.supportWildlife();
    }
}
