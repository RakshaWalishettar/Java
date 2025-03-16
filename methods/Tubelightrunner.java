class Tubelightrunner{
	public static void main(String[] args)
	{
		String light="on";
		Tubelight.switchingon(light);
		
		String tublight="off";
		Tubelight.switchingoff(light);
		
		String error="flicker";
		Tubelight.flickering(error);
		
		int count=100;
		String brand="LKS";
		Tubelight.replacing(count,brand);
		
		boolean defect=true;
		int volt=5;
		Tubelight.reparing(defect,volt);
		
		double price=120;
		String colour="white";
		char word='L';
		Tubelight.recycling(price,colour,word);
		
		boolean clean=false;
		int year=2025;
		String shape="round";
		Tubelight.cleaning(clean,year,shape);
	}
	
	
}