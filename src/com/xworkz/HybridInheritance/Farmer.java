package com.xworkz.HybridInheritance;

public interface Farmer {
    void growCrops();
}

interface Seller {
    void sellProduce();
}

class AgroBusinessman implements Farmer, Seller {
    public void growCrops() {
        System.out.println("Growing organic vegetables and fruits");
    }

    public void sellProduce() {
        System.out.println("Selling fresh produce in the local market");
    }

    public static void main(String[] args) {
        AgroBusinessman ab = new AgroBusinessman();
        ab.growCrops();
        ab.sellProduce();
    }
}
