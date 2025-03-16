class Egg{
	String color;
    double weight;
    int size;
    boolean isOrganic;
    String type;
    String sourceFarm;
	
	Egg()
	{
		System.out.println("no-args const");
	}
	Egg(String color)
	{
		this.color=color;
		System.out.println("the color is const in Egg");
	}
	Egg (String color, double weight)
	{
		this.color=color;
		this.weight=weight;
		System.out.println("the color ,weight is const in Egg");
	}
	Egg(String color, double weight,int size)
	{
		this.color=color;
		this.weight=weight;
		this.size=size;
		System.out.println("the color,weight,size is const in Egg");
	}
	Egg(String color, double weight,int size,boolean isOrganic)
	{
		this.color=color;
		this.weight=weight;
		this.size=size;
		this.isOrganic=isOrganic;
		System.out.println("the color,weight,size,isOrganic is const in Egg");
	}
	Egg(String color, double weight,int year,boolean isOrganic,String type)
	{
		this.color=color;
		this.weight=weight;
		this.size=size;
		this.isOrganic=isOrganic;
		this.type=type;
		System.out.println("the color,weight,size,isOrganic,type is const in Egg");
	}
	Egg(String color, double weight,int year,boolean isOrganic,  String type, String sourceFarm)
	{
		this.color=color;
		this.weight=weight;
		this.size=size;
		this.isOrganic=isOrganic;
		this.type=type;
		this.sourceFarm=sourceFarm;
		System.out.println("the brand,weight,size,isOrganic,type,isAutomatic is const in Egg");
	}
	void display()
	{
		System.out.println("details of Pichkari:");
		System.out.println("color :"+color);
		System.out.println("weight :"+weight);
		System.out.println("size :"+size);
		System.out.println("isOrganic :"+isOrganic);
		System.out.println("type :"+type);
		System.out.println("sourceFarm :"+sourceFarm);
		System.out.println("=================================");
	}
}