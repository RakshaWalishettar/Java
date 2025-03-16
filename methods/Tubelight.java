class Tubelight{
	public static void switchingon(String on)
	{
		System.out.println("light");
		System.out.println(on);
	}
	public static void switchingoff(String off)
	{
		System.out.println("no light");
		System.out.println(off);
	}
	public static void flickering(String issue)
	{
		System.out.println("fault");
		System.out.println(issue);
	}
	public static void replacing(int count,String brand)
	{
		System.out.println("bulb");
		System.out.println(count);
		System.out.println(brand);
	}
	public static void reparing(boolean yesorno,int volt)
	{
		System.out.println("defect");
		System.out.println(yesorno);
		System.out.println(volt);
	}
	public static void recycling(double price,String colour,char L)
	{
		System.out.println("different");
		System.out.println(price);
		System.out.println(colour);
		System.out.println(L);
	}
	public static void cleaning(boolean yesorno,int date,String size)
	{
		System.out.println("new");
		System.out.println(yesorno);
		System.out.println(date);
		System.out.println(size);
	}	
	
}