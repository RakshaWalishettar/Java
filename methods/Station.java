class Station{
	public static void send(String send)
	{
		System.out.println("deliver the item");
		System.out.println("send :"+ send);
		DeliveryGuy.accept(send);
		
	}
}