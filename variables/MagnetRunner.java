class MagnetRunner{
	public static void main(String[] args)
	{	
		String type1="Neodymium";
		double magneticStrength1=14	;
		String material1="Neodymium-Iron-Boron";
		Magnet hpp=new Magnet(type1,magneticStrength1,material1);
		System.out.println("the info of the charger :"+type1);
		System.out.println("the info of the charger :"+magneticStrength1);
		System.out.println("the info of the charger :"+material1);
		System.out.println("=====================");
		
		String type2="Ferrite";
		double magneticStrength2=05;
		String material2="Iron Oxide";
		Magnet hmc=new Magnet(type2,magneticStrength2,material2);
		System.out.println("the info of the charger :"+type2);
		System.out.println("the info of the charger :"+magneticStrength2);
		System.out.println("the info of the charger :"+material2);
		System.out.println("=====================");
		
		String type3="Alnico";
		double magneticStrength3=12;
		String material3="Aluminum-Nickel-Cobalt";
		Magnet hdbc=new Magnet(type3,magneticStrength3,material3);
		System.out.println("the info of the charger :"+type3);
		System.out.println("the info of the charger :"+magneticStrength3);
		System.out.println("the info of the charger :"+material3);
		System.out.println("=====================");
		
		String type4="Samarium Cobalt";
		double magneticStrength4=11;
		String material4="Samarium-Cobalt";
		Magnet hfcb=new Magnet(type4,magneticStrength4,material4);
		System.out.println("the info of the charger :"+type4);
		System.out.println("the info of the charger :"+magneticStrength4);
		System.out.println("the info of the charger :"+material4);
		System.out.println("=====================");
		
		String type5="Electromagnet";
		double magneticStrength5=20	;
		String material5="Copper Wire & Iron Core";
		Magnet htcg=new Magnet(type5,magneticStrength5,material5);
		System.out.println("the info of the charger :"+type5);
		System.out.println("the info of the charger :"+magneticStrength5);
		System.out.println("the info of the charger :"+material5);
		System.out.println("=====================");
	}

}