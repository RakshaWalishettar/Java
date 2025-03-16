class Beerrun{
	public static void main(String[] args)
	{
		String beer="fermentation";
		Beer.brewing(beer);
		
		String different="varity";
		Beer.pouring(different);
		
		String match="different";
		Beer.pairing(match);
		
		int size=10;
		String tube="lenght";
		Beer.filtering(size,tube);
		
		boolean prue=true;
		int number=5;
		Beer.mashing(prue,number);
		
		double prize=10;
		String name="type";
		char word='B';
		Beer.packaging(prize,name,word);
		
		boolean lightroom=false;
		int count=7;
		String brand="pll";
		Beer.storing(lightroom,count,brand);
	}
	
}