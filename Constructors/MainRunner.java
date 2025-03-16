class MainRunner{
	public static void main (String[] args)
	{
		Ballon b1=new Ballon();
		b1.display();
		Ballon b2=new Ballon("red");
		b2.display();
		Ballon b3=new Ballon("green","xx");
		b3.display();
		Ballon b4=new Ballon("yellow","plastic",2);
		b4.display();
		Ballon b5=new Ballon("black","rubber",8,10);
		b5.display();
		Ballon b6=new Ballon("blue","silicon",3,100,true);
		b6.display();
		Ballon b7=new Ballon("pink","foil",6,160,false,"heart");
		b7.display();
		System.out.println("=================================");
		
		Holi h1=new Holi();
		h1.display();
		Holi h2=new Holi("Holi Festival");
		h2.display();
		Holi h3=new Holi("Holi","Blue");
		h3.display();
		Holi h4=new Holi("Holi","green",2024);
		h4.display();
		Holi h5=new Holi("Holi","yellow",2023,"mathura");
		h5.display();
		Holi h6=new Holi("Holi","pink",2022,"davanger",500);
		h6.display();
		Holi h7=new Holi("Holi","orange",2021,"haveri",1000,false);
		h7.display();
		System.out.println("=================================");
		
		Colour c1=new Colour();
		c1.display();
		Colour c2=new Colour("Watercolour");
		c2.display();
		Colour c3=new Colour("paint",3);
		c3.display();
		Colour c4=new Colour("WaterBlast",4,18);
		c4.display();
		Colour c5=new Colour("JetStream",20,1000,"green");
		c5.display();
		Colour c6=new Colour("HydroForce",25,1200,"orange",250);
		c6.display();
		Colour c7=new Colour("SuperSoaker",30,1500,"pink",45,355);
		c7.display();
		System.out.println("=================================");
		
		Egg e1=new Egg();
		e1.display();
		Egg e2=new Egg("Brown");
		e2.display();
		Egg e3=new Egg("White",30);
		e3.display();
		Egg e4=new Egg("Brown",55,4);
		e4.display();
		Egg e5=new Egg("White",65,5,true);
		e5.display();
		Egg e6=new Egg("Blue",70,6,true,"duck");
		e6.display();
		Egg e7=new Egg("Green",75,7,false,"goose","organic farm");
		e7.display();
		System.out.println("=================================");
		
		Bucket bb1=new Bucket();
		bb1.display();
		Bucket bb2=new Bucket("Metal");
		bb2.display();
		Bucket bb3=new Bucket("Plastic","Red",30);
		bb3.display();
		Bucket bb4=new Bucket("Steel","Silver",55);
		bb4.display();
		Bucket bb5=new Bucket("Aluminum","White",65,5);
		bb5.display();
		Bucket bb6=new Bucket("Copper","Brown",70,6,45);
		bb6.display();
		Bucket bb7=new Bucket("Green","Brown",30,18,14,false);
		bb7.display();
		System.out.println("=================================");
		
		Tomato t1=new Tomato();
		t1.display();
		Tomato t2=new Tomato("Cherry");
		t2.display();
		Tomato t3=new Tomato("Roma","Red");
		t3.display();
		Tomato t4=new Tomato("Beefsteak","Silver",55);
		t4.display();
		Tomato t5=new Tomato("Heirloom","White",65,true);
		t5.display();
		Tomato t6=new Tomato("Grape","Brown",70,true,45);
		t6.display();
		Tomato t7=new Tomato("San Marzano","pink",30,true,14,199);
		t7.display();
		System.out.println("=================================");
		
		WaterBalls wb1=new WaterBalls();
		wb1.display();
		WaterBalls wb2=new WaterBalls("Red");
		wb2.display();
		WaterBalls wb3=new WaterBalls("Red",10);
		wb3.display();
		WaterBalls wb4=new WaterBalls("Red",20,15);
		wb4.display();
		WaterBalls wb5=new WaterBalls("Red",35,52,"AquaBall");
		wb5.display();
		WaterBalls wb6=new WaterBalls("Red",50,32,"AquaBall",true);
		wb6.display();
		WaterBalls wb7=new WaterBalls("Red",70,45,"AquaBall",true,"good");
		wb7.display();
		System.out.println("=================================");
		
		Gun g1=new Gun();
		g1.display();
		Gun g2=new Gun("AK-47");
		g2.display();
		Gun g3=new Gun("M16","Assault Rifle");
		g3.display();
		Gun g4=new Gun("Glock 19","Pistol",15);
		g4.display();
		Gun g5=new Gun("Desert Eagle","Pistol",52,19);
		g5.display();
		Gun g6=new Gun("MP5","Submachine Gun",30,2.5,"Heckler & Koch");
		g6.display();
		Gun g7=new Gun("Barrett M82","Sniper Rifle",10,45,"AquaBall",9000);
		g7.display();
		System.out.println("=================================");
		
		NailPolish np1=new NailPolish();
		np1.display();
		NailPolish np2=new NailPolish("O.P.I");
		np2.display();
		NailPolish np3=new NailPolish("Revlon","Red");
		np3.display();
		NailPolish np4=new NailPolish("Maybelline","Pink","Matte");
		np4.display();
		NailPolish np5=new NailPolish("Essie","Blue","Shimmer",899);
		np5.display();
		NailPolish np6=new NailPolish("Sally Hansen","Black","Glossy",549,15);
		np6.display();
		NailPolish np7=new NailPolish("Chanel","Gold","Metallic",28,90,true);
		np7.display();
		System.out.println("=================================");
		
		Water w1=new Water();
		w1.display();
		Water w2=new Water("Fresh");
		w2.display();
		Water w3=new Water("Fresh",7);
		w3.display();
		Water w4=new Water("Fresh",7,25);
		w4.display();
		Water w5=new Water("Fresh",7,25,true);
		w5.display();
		Water w6=new Water("Fresh Hansen",77,536,true,549);
		w6.display();
		Water w7=new Water("Fresh",28,90,true,785,"Spring");
		w7.display();
		System.out.println("=================================");

	}

}