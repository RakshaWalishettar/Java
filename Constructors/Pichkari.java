class Pichkari{
	String brand;
    String color;
    int size;
    int waterCapacity;
    double price;
    boolean isAutomatic;
	
	Pichkari()
	{
		System.out.println("no-args const");
	}
	Pichkari(String brand)
	{
		this.brand=brand;
		System.out.println("the brand is const in Pichkari");
	}
	Pichkari (String brand,String color)
	{
		this.brand=brand;
		this.color=color;
		System.out.println("the brand ,color is const in Pichkari");
	}
	Pichkari(String brand,String color,int size)
	{
		this.brand=brand;
		this.color=color;
		this.size=size;
		System.out.println("the brand,color,size is const in Pichkari");
	}
	Pichkari(String brand,String color,int size,int waterCapacity)
	{
		this.brand=brand;
		this.color=color;
		this.size=size;
		this.waterCapacity=waterCapacity;
		System.out.println("the brand,color,size,waterCapacity is const in Pichkari");
	}
	Pichkari(String brand,String color,int year,int waterCapacity,double price)
	{
		this.brand=brand;
		this.color=color;
		this.size=size;
		this.waterCapacity=waterCapacity;
		this.price=price;
		System.out.println("the brand,color,size,waterCapacity,price is const in Pichkari");
	}
	Pichkari(String brand,String color,int year,int waterCapacity,  double price, boolean isAutomatic)
	{
		this.brand=brand;
		this.color=color;
		this.size=size;
		this.waterCapacity=waterCapacity;
		this.price=price;
		this.isAutomatic=isAutomatic;
		System.out.println("the brand,color,size,waterCapacity,price,isAutomatic is const in Pichkari");
	}
	void display()
	{
		System.out.println("details of Pichkari:");
		System.out.println("brand :"+brand);
		System.out.println("color :"+color);
		System.out.println("size :"+size);
		System.out.println("waterCapacity :"+waterCapacity);
		System.out.println("price :"+price);
		System.out.println("isAutomatic :"+isAutomatic);
		System.out.println("=================================");
	}
}