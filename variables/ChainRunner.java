class ChainRunner{
	public static void main(String[] args)
	{	
		String material1="Gold";
		double length1=14	;
		int weight1=20;
		Chain hpp=new Chain(material1,length1,weight1);
		System.out.println("the info of the Chain :"+material1);
		System.out.println("the info of the Chain :"+length1);
		System.out.println("the info of the Chain :"+weight1);
		System.out.println("=====================");
		
		String material2="Silver";
		double length2=05;
		int weight2=25;
		Chain hmc=new Chain(material2,length2,weight2);
		System.out.println("the info of the Chain :"+material2);
		System.out.println("the info of the Chain :"+length2);
		System.out.println("the info of the Chain :"+weight2);
		System.out.println("=====================");
		
		String material3="Platinum";
		double length3=12;
		int weight3=30;
		Chain hdbc=new Chain(material3,length3,weight3);
		System.out.println("the info of the Chain :"+material3);
		System.out.println("the info of the Chain :"+length3);
		System.out.println("the info of the Chain :"+weight3);
		System.out.println("=====================");
		
		String material4="Stainless Steel";
		double length4=11;
		int weight4=15;
		Chain hfcb=new Chain(material4,length4,weight4);
		System.out.println("the info of the Chain :"+material4);
		System.out.println("the info of the Chain :"+length4);
		System.out.println("the info of the Chain :"+weight4);
		System.out.println("=====================");
		
		String material5="Gold & Diamonds";
		double length5=20	;
		int weight5=35;
		Chain htcg=new Chain(material5,length5,weight5);
		System.out.println("the info of the Chain :"+material5);
		System.out.println("the info of the Chain :"+length5);
		System.out.println("the info of the Chain :"+weight5);
		System.out.println("=====================");
	}


}