class Courier{
	public static void pickup(String A)
	{
		System.out.println("for the location");
		System.out.println("A :"+A);
		Station.send(A);
	}

}