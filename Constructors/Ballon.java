class Ballon{
	String colour;
	String material;
	int size;
	double price;
	boolean isInflated;
	String shape;
	
	Ballon()
	{
		System.out.println("the no-arg constructor");
	}
	Ballon(String colour)
	{
		this.colour=colour;
		System.out.println("the colour is const in ballon");
	}
	Ballon (String colour,String material)
	{
		this.colour=colour;
		this.material=material;
		System.out.println("the colour ,material is const in ballon");
	}
	Ballon(String colour,String material,int size)
	{
		this.colour=colour;
		this.material=material;
		this.size=size;
		System.out.println("the colour,material,size is const in ballon");
	}
	Ballon(String colour,String material,int size,double price)
	{
		this.colour=colour;
		this.material=material;
		this.size=size;
		this.price=price;
		System.out.println("the colour,material,size,price is const in ballon");
	}
	Ballon(String colour,String material,int size,double price,boolean isInflated)
	{
		this.colour=colour;
		this.material=material;
		this.size=size;
		this.price=price;
		this.isInflated=isInflated;
		System.out.println("the colour,material,size,price is const in ballon");
	}
	Ballon(String colour,String material,int size,double price,boolean isInflated,String shape)
	{
		this.colour=colour;
		this.material=material;
		this.size=size;
		this.price=price;
		this.isInflated=isInflated;
		this.shape=shape;
		System.out.println("the colour,material,size,price,shape is const in ballon");
	}
	void display()
	{
		System.out.println("details of Ballon:");
		System.out.println("colour :"+colour);
		System.out.println("material :"+material);
		System.out.println("size :"+size);
		System.out.println("price :"+price);
		System.out.println("isInflated :"+isInflated);
		System.out.println("Shape :"+shape);
		System.out.println("=================================");
	}
}