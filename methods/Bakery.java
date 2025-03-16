class Bakery{
	public static void buy(String itemName,int quantity)
	{
		System.out.println("runner bakery");
		System.out.println(itemName);
		System.out.println(quantity);
		
		
		
	} 
	public static void open(boolean yesorno)
	{
		System.out.println("bakeryisopen");
		System.out.println(yesorno);
	}
	public static void close(boolean yesorno)
	{
		System.out.println("no close");
		System.out.println(yesorno);
	}
	public static void owner(String owner)
	{
		System.out.println("bakery has owner");
		System.out.println(owner);
	}	
	public static void cashier(String name)
	{
		System.out.println("collects amount");
		System.out.println(name);
	}
}