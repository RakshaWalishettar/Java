class Bakeryrun{
	public static void main(String[] args)
	{
		String itemname="cake";
		int quantity=5;
		//System.out.println(itemname+quantity);
	
	Bakery.buy(itemname,quantity);
	
		boolean shop=true;
		Bakery.open(shop);
		
		boolean shopeclose=false;
		Bakery.close(shopeclose);
		
		String name="Anup";
		Bakery.owner(name);
		
		String cashier="Rani";
		Bakery.cashier(cashier);
	}
	
}