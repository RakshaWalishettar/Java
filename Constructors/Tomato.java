class Tomato{
	String variety;
    String color;
    double weight;
    boolean isRipe;
    int shelfLife;
    double price;
	
	Tomato()
	{
		System.out.println("no-args const");
	}
	Tomato(String variety)
	{
		this.variety=variety;
		System.out.println("the variety is const in Tomato");
	}
	Tomato (String variety,String color)
	{
		this.variety=variety;
		this.color=color;
		System.out.println("the variety ,color is const in Tomato");
	}
	Tomato(String variety,String color,double weight)
	{
		this.variety=variety;
		this.color=color;
		this.weight=weight;
		System.out.println("the variety,color,weight is const in Tomato");
	}
	Tomato(String variety,String color,double weight,boolean isRipe)
	{
		this.variety=variety;
		this.color=color;
		this.weight=weight;
		this.isRipe=isRipe;
		System.out.println("the variety,color,weight,isRipe is const in Tomato");
	}
	Tomato(String variety,String color,double weight,boolean isRipe,int shelfLife)
	{
		this.variety=variety;
		this.color=color;
		this.weight=weight;
		this.isRipe=isRipe;
		this.shelfLife=shelfLife;
		System.out.println("the variety,color,weight,isRipe,shelfLife is const in Tomato");
	}
	Tomato(String variety,String color,double weight,boolean isRipe,int shelfLife, double price)
	{
		this.variety=variety;
		this.color=color;
		this.weight=weight;
		this.isRipe=isRipe;
		this.shelfLife=shelfLife;
		this.price=price;
		System.out.println("the variety,color,weight,isRipe,shelfLife,price is const in Tomato");
	}
	void display()
	{
		System.out.println("details of Tomato:");
		System.out.println("variety :"+variety);
		System.out.println("color :"+color);
		System.out.println("weight :"+weight);
		System.out.println("isRipe :"+isRipe);
		System.out.println("shelfLife :"+shelfLife);
		System.out.println("price :"+price);
		System.out.println("=================================");
	}
}