class Powerbank{
	int batterycapacity;
	String company;
	double weight;
	boolean hasfastingcharging;
	public static void main(String[] args)
	{
		Powerbank pb1=new Powerbank();
		System.out.println("the details of the power bank :"+pb1.batterycapacity);
		System.out.println("the details of the power bank :"+pb1.company);
		System.out.println("the details of the power bank :"+ pb1.weight);
		System.out.println("the details of the power bank :"+ pb1.hasfastingcharging);
		
		System.out.println("the update starts");
		
		pb1.batterycapacity=20000;
		System.out.println("the details of the power bank :"+pb1.batterycapacity);
		pb1.company="Mi";
		System.out.println("the details of the power bank :"+pb1.company);
		pb1.weight=430;
		System.out.println("the details of the power bank :"+ pb1.weight);
		pb1.hasfastingcharging=true;
		System.out.println("the details of the power bank :"+ pb1.hasfastingcharging);
		
		Powerbank pb2=new Powerbank();
		pb2.batterycapacity=10000;
		System.out.println("the details of the power bank :"+pb2.batterycapacity);
		pb2.company="Realme";
		System.out.println("the details of the power bank :"+pb2.company);
		pb2.weight=250	;
		System.out.println("the details of the power bank :"+ pb2.weight);
		pb2.hasfastingcharging=true;
		System.out.println("the details of the power bank :"+ pb2.hasfastingcharging);
		
		Powerbank pb3=new Powerbank();
		pb3.batterycapacity=26800;
		System.out.println("the details of the power bank :"+pb3.batterycapacity);
		pb3.company="Anker";
		System.out.println("the details of the power bank :"+pb3.company);
		pb3.weight=500;
		System.out.println("the details of the power bank :"+ pb3.weight);
		pb3.hasfastingcharging=true;
		System.out.println("the details of the power bank :"+ pb3.hasfastingcharging);
		
		Powerbank pb4=new Powerbank();
		pb4.batterycapacity=20000;
		System.out.println("the details of the power bank :"+pb4.batterycapacity);
		pb4.company="Ambrane";
		System.out.println("the details of the power bank :"+pb4.company);
		pb4.weight=400;
		System.out.println("the details of the power bank :"+ pb4.weight);
		pb4.hasfastingcharging=true;
		System.out.println("the details of the power bank :"+ pb4.hasfastingcharging);
		
		Powerbank pb5=new Powerbank();
		pb5.batterycapacity=10000;
		System.out.println("the details of the power bank :"+pb5.batterycapacity);
		pb5.company="OnePlus";
		System.out.println("the details of the power bank :"+pb5.company);
		pb5.weight=225;
		System.out.println("the details of the power bank :"+ pb5.weight);
		pb5.hasfastingcharging=true;
		System.out.println("the details of the power bank :"+ pb5.hasfastingcharging);
		
		Powerbank pb6=new Powerbank();
		pb6.batterycapacity=25000;
		System.out.println("the details of the power bank :"+pb6.batterycapacity);
		pb6.company="Samsung";
		System.out.println("the details of the power bank :"+pb6.company);
		pb6.weight=450;
		System.out.println("the details of the power bank :"+ pb6.weight);
		pb6.hasfastingcharging=true;
		System.out.println("the details of the power bank :"+ pb6.hasfastingcharging);
		
		Powerbank pb7=new Powerbank();
		pb7.batterycapacity=20000;
		System.out.println("the details of the power bank :"+pb7.batterycapacity);
		pb7.company="Redmi";
		System.out.println("the details of the power bank :"+pb7.company);
		pb7.weight=430;
		System.out.println("the details of the power bank :"+ pb7.weight);
		pb7.hasfastingcharging=true;
		System.out.println("the details of the power bank :"+ pb7.hasfastingcharging);
		
		Powerbank pb8=new Powerbank();
		pb8.batterycapacity=10000;
		System.out.println("the details of the power bank :"+pb8.batterycapacity);
		pb8.company="URBN";
		System.out.println("the details of the power bank :"+pb8.company);
		pb8.weight=300;
		System.out.println("the details of the power bank :"+ pb8.weight);
		pb8.hasfastingcharging=false;
		System.out.println("the details of the power bank :"+ pb8.hasfastingcharging);
		
		Powerbank pb9=new Powerbank();
		pb9.batterycapacity=15000;
		System.out.println("the details of the power bank :"+pb9.batterycapacity);
		pb9.company="boAt";
		System.out.println("the details of the power bank :"+pb9.company);
		pb9.weight=350;
		System.out.println("the details of the power bank :"+ pb9.weight);
		pb9.hasfastingcharging=true;
		System.out.println("the details of the power bank :"+ pb9.hasfastingcharging);
		
		Powerbank pb10=new Powerbank();
		pb10.batterycapacity=20000;
		System.out.println("the details of the power bank :"+pb10.batterycapacity);
		pb10.company="Syska";
		System.out.println("the details of the power bank :"+pb10.company);
		pb10.weight=430;
		System.out.println("the details of the power bank :"+ pb10.weight);
		pb10.hasfastingcharging=false;
		System.out.println("the details of the power bank :"+ pb10.hasfastingcharging);
		
		System.out.println("the updating ends");
	}
}