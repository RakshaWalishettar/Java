class Whiskeyrunner{
	public static void main(String[] args)
	{
		String serving="poue";
		Whiskey.pouring(serving);
		
		String drink="glass";
		Whiskey.sipping(drink);
		
		String sorting="filtering";
		Whiskey.aging(sorting);
		
		int size=100;
		String flavour="none";
		Whiskey.mixing(size,flavour);
		
		boolean rosting=true;
		int time=10;
		Whiskey.swirling(rosting,time);
		
		double weight=2;
		String day="sunday";
		char word='W';
		Whiskey.Distilling(time,day,word);
		
		boolean birthday=true;
		int cost=7000;
		String brand="McDowell's";
		Whiskey.gifting(birthday,cost,brand);
	}
	
}