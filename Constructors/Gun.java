class Gun{
	String name;
    String type;
    int capacity;
    double weight;
    String manufacturer;
    double price;
	
	Gun() 
	{
		System.out.println("no-args const of gun");
    }

    Gun(String name) 
	{
        this.name = name;
		System.out.println("the name const of gun");
        
    }

    Gun(String name, String type) {
        this(name);
        this.type = type;
		System.out.println("the name,type const of gun");
    }

    Gun(String name, String type, int capacity) {
        this(name, type);
        this.capacity = capacity;
		System.out.println("the name,type,capacity const of gun");
    }

    Gun(String name, String type, int capacity, double weight) {
        this(name, type, capacity);
        this.weight = weight;
		System.out.println("name,type,capacity,weight const of gun");
    }

    Gun(String name, String type, int capacity, double weight, String manufacturer) {
        this(name, type, capacity, weight);
        this.manufacturer = manufacturer;
		System.out.println("name,type,capacity,weight,manufacturer const of gun");
    }

    Gun(String name, String type, int capacity, double weight, String manufacturer, double price) {
        this(name, type, capacity, weight, manufacturer);
        this.price = price;
		System.out.println("name,type,capacity,weight,manufacturer,price const of gun");
    }

    void display() {
        System.out.println("Gun Name: " + name);
        System.out.println("Type: " + type);
        System.out.println("Capacity: " + capacity);
        System.out.println("Weight: " + weight + " kg");
        System.out.println("Manufacturer: " + manufacturer);
        System.out.println("Price: $" + price);
        System.out.println("===================================");
    }
}