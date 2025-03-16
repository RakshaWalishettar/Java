class ChargeRunner{
	public static void main(String[] args)
	{	
		String Type1="Electron";
		double Value1=1602;
		String Partical1="Subatomic Particle";
		Charge Electron=new Charge(Type1,Value1,Partical1);
		System.out.println("the info of the charger :"+Type1);
		System.out.println("the info of the charger :"+Value1);
		System.out.println("the info of the charger :"+Partical1);
		System.out.println("=====================");
		
		String Type2="Proton";
		double Value2=1602;
		String Partical2="Subatomic Particle";
		Charge Proton=new Charge(Type2,Value2,Partical2);
		System.out.println("the info of the charger :"+Type2);
		System.out.println("the info of the charger :"+Value2);
		System.out.println("the info of the charger :"+Partical2);
		System.out.println("=====================");
		
		String Type3="Neutron";
		double Value3=0;
		String Partical3="Subatomic Particle";
		Charge Neutron=new Charge(Type3,Value3,Partical3);
		System.out.println("the info of the charger :"+Type3);
		System.out.println("the info of the charger :"+Value3);
		System.out.println("the info of the charger :"+Partical3);
		System.out.println("=====================");
		
		String Type4="Alpha Particle";
		double Value4=3204;
		String Partical4="Atomic Nucleus";
		Charge AlphaParticle=new Charge(Type4,Value4,Partical4);
		System.out.println("the info of the charger :"+Type4);
		System.out.println("the info of the charger :"+Value4);
		System.out.println("the info of the charger :"+Partical4);
		System.out.println("=====================");
		
		String Type5="Ion";
		double Value5=1602;
		String Partical5="Ion";
		Charge Ion=new Charge(Type5,Value5,Partical5);
		System.out.println("the info of the charger :"+Type5);
		System.out.println("the info of the charger :"+Value5);
		System.out.println("the info of the charger :"+Partical5);
		System.out.println("=====================");
		
		
	
	}

}