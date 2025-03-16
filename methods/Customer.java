class Customer{
		public static void buy(String vegetable,int quantity)
		{
			System.out.println("customer buy vegetable");
			System.out.println("vegetable :"+vegetable);
			System.out.println("quantity :"+quantity);
			Shop.sell(vegetable,quantity);
		}

}