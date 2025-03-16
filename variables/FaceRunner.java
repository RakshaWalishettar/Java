class FaceRunner{
	public static void main(String[] args)
	{	
		String skinTone1="Fair";
		int numberOfEyes1=2;
		String expression1="Happy";
		Face SmilingFace=new Face(skinTone1,numberOfEyes1,expression1);
		System.out.println("the info of the Face :"+skinTone1);
		System.out.println("the info of the Face :"+numberOfEyes1);
		System.out.println("the info of the Face :"+expression1);
		System.out.println("=====================");
		
		String skinTone2="Dark";
		int numberOfEyes2=2;
		String expression2="Furious";
		Face AngryFace=new Face(skinTone2,numberOfEyes2,expression2);
		System.out.println("the info of the Face :"+skinTone2);
		System.out.println("the info of the Face :"+numberOfEyes2);
		System.out.println("the info of the Face :"+expression2);
		System.out.println("=====================");
		
		String skinTone3="Medium";
		int numberOfEyes3=2;
		String expression3="Tearful";
		Face SadFace=new Face(skinTone3,numberOfEyes3,expression3);
		System.out.println("the info of the Face :"+skinTone3);
		System.out.println("the info of the Face :"+numberOfEyes3);
		System.out.println("the info of the Face :"+expression3);
		System.out.println("=====================");
		
		String skinTone4="Light";
		int numberOfEyes4=2;
		String expression4="Shocked";
		Face SurprisedFace =new Face(skinTone4,numberOfEyes4,expression4);
		System.out.println("the info of the Face :"+skinTone4);
		System.out.println("the info of the Face :"+numberOfEyes4);
		System.out.println("the info of the Face :"+expression4);
		System.out.println("=====================");
		
		String skinTone5="Tan";
		int numberOfEyes5=1;
		String expression5="Playful";
		Face WinkingFace=new Face(skinTone5,numberOfEyes5,expression5);
		System.out.println("the info of the Face :"+skinTone5);
		System.out.println("the info of the Face :"+numberOfEyes5);
		System.out.println("the info of the Face :"+expression5);
		System.out.println("=====================");
		
		
	
	}

}