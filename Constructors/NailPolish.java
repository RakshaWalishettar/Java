class NailPolish{
	String brand;
    String color;
    String finish;
    double price;
    int volume;
    boolean Dry;

    NailPolish() {
        System.out.println("no args const of nailpolish");
    }

    NailPolish(String brand) {
        this.brand = brand;
		System.out.println("brand const of nailpolish");
    }
	
    NailPolish(String brand, String color) {
        this(brand);
        this.color = color;
		System.out.println("brand,color const of nailpolish");
    }

    NailPolish(String brand, String color, String finish) {
        this(brand, color);
        this.finish = finish;
		System.out.println("brand,color,finish const of nailpolish");
    }

    NailPolish(String brand, String color, String finish, double price) {
        this(brand, color, finish);
        this.price = price;
		System.out.println("brand,color,finish,price const of nailpolish");
    }

    NailPolish(String brand, String color, String finish, double price, int volume) {
        this(brand, color, finish, price);
        this.volume = volume;
		System.out.println("brand,color,finish,price,volume const of nailpolish");
    }

    NailPolish(String brand, String color, String finish, double price, int volume, boolean Dry) {
        this(brand, color, finish, price, volume);
        this.Dry = Dry;
		System.out.println("brand,color,finish,price,volume,Dry const of nailpolish");
    }

    void display() {
        System.out.println("Brand: " + brand);
        System.out.println("Color: " + color);
        System.out.println("Finish: " + finish);
        System.out.println("Price: " + price);
        System.out.println("Volume: " + volume);
        System.out.println("Dry: " + Dry);
        System.out.println("==================================");
    }
}