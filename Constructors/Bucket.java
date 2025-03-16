class Bucket{
	String material;
    String color;
    double capacity;
    double height;
    double diameter;
    boolean hasHandle;
	
	Bucket()
	{
		System.out.println("no-args const");
	}
	Bucket(String material)
	{
		this.material=material;
		System.out.println("the material is const in Bucket");
	}
	Bucket (String material, String color)
	{
		this.material=material;
		this.color=color;
		System.out.println("the material ,color is const in Bucket");
	}
	Bucket(String material,String color, double capacity)
	{
		this.material=material;
		this.color=color;
		this.capacity=capacity;
		System.out.println("the material,color,capacity is const in Bucket");
	}
	Bucket(String material, String color, double capacity, double height)
	{
		this.material=material;
		this.color=color;
		this.capacity=capacity;
		this.height=height;
		System.out.println("the material,color,capacity,height is const in Bucket");
	}
	Bucket(String material, String color, double capacity, double height,double diameter)
	{
		this.material=material;
		this.color=color;
		this.capacity=capacity;
		this.height=height;
		this.diameter=diameter;
		System.out.println("the material,color,capacity,isOrganic,diameter is const in Bucket");
	}
	Bucket(String material,String color, double capacity, double height, double diameter,boolean hasHandle)
	{
		this.material=material;
		this.color=color;
		this.capacity=capacity;
		this.height=height;
		this.diameter=diameter;
		this.hasHandle=hasHandle;
		System.out.println("the material,color,capacity,height,diameter,hasHandle is const in Bucket");
	}
	void display()
	{
		System.out.println("details of Bucket:");
		System.out.println("material :"+material);
		System.out.println("color :"+color);
		System.out.println("capacity :"+capacity);
		System.out.println("height :"+height);
		System.out.println("diameter :"+diameter);
		System.out.println("hasHandle :"+hasHandle);
		System.out.println("=================================");
	}
}