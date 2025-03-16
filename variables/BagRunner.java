class BagRunner{
		double price;
		String brand;
		char size;
		int quantity;
		public static void main(String[] args)
		{
			BagRunner bag1=new BagRunner();
			System.out.println("The bag consists of price :"+bag1.price);
			System.out.println("The bag consists of brand :"+bag1.brand);
			System.out.println("The bag consists of size :"+bag1.size);
			System.out.println("The bag consists of quantity :"+bag1.quantity);
			
			System.out.println(" update will begin");
			
			bag1.price=5000;
			System.out.println("the updated bag price is :"+bag1.price);
			bag1.brand="Adidas";
			System.out.println("the updated bag brand is :"+bag1.brand);
			bag1.size='M';
			System.out.println("the updated bag size is :"+bag1.size);
			bag1.quantity=2;
			System.out.println("the updated bag quantity is :"+bag1.quantity);
			
			BagRunner bag2=new BagRunner();
			bag2.price=2500;
			System.out.println("the updated bag price is :"+bag2.price);
			bag2.brand="Wildcraft";
			System.out.println("the updated bag brand is :"+bag2.brand);
			bag2.size='M';
			System.out.println("the updated bag size is :"+bag2.size);
			bag2.quantity=5;
			System.out.println("the updated bag quantity is :"+bag2.quantity);
			
			BagRunner bag3=new BagRunner();
			bag3.price=3200;
			System.out.println("the updated bag price is :"+bag3.price);
			bag3.brand="Skybags";
			System.out.println("the updated bag brand is :"+bag3.brand);
			bag3.size='B';
			System.out.println("the updated bag size is :"+bag3.size);
			bag3.quantity=8;
			System.out.println("the updated bag quantity is :"+bag3.quantity);
			
			BagRunner bag4=new BagRunner();
			bag4.price=3800;
			System.out.println("the updated bag price is :"+bag4.price);
			bag4.brand="American Tourister";
			System.out.println("the updated bag brand is :"+bag4.brand);
			bag4.size='M';
			System.out.println("the updated bag size is :"+bag4.size);
			bag4.quantity=1;
			System.out.println("the updated bag quantity is :"+bag4.quantity);
			
			BagRunner bag5=new BagRunner();
			bag5.price=4500;
			System.out.println("the updated bag price is :"+bag5.price);
			bag5.brand="Nike";
			System.out.println("the updated bag brand is :"+bag5.brand);
			bag5.size='S';
			System.out.println("the updated bag size is :"+bag5.size);
			bag5.quantity=1;
			System.out.println("the updated bag quantity is :"+bag5.quantity);
			
			BagRunner bag6=new BagRunner();
			bag6.price=3600;
			System.out.println("the updated bag price is :"+bag6.price);
			bag6.brand="Puma";
			System.out.println("the updated bag brand is :"+bag6.brand);
			bag6.size='S';
			System.out.println("the updated bag size is :"+bag6.size);
			bag6.quantity=5;
			System.out.println("the updated bag quantity is :"+bag6.quantity);
			
			BagRunner bag7=new BagRunner();
			bag7.price=7500;
			System.out.println("the updated bag price is :"+bag7.price);
			bag7.brand="Samsonite";
			System.out.println("the updated bag brand is :"+bag7.brand);
			bag7.size='B';
			System.out.println("the updated bag size is :"+bag7.size);
			bag7.quantity=3;
			System.out.println("the updated bag quantity is :"+bag7.quantity);
			
			BagRunner bag8=new BagRunner();
			bag8.price=5000;
			System.out.println("the updated bag price is :"+bag8.price);
			bag8.brand="VIP";
			System.out.println("the updated bag brand is :"+bag8.brand);
			bag8.size='M';
			System.out.println("the updated bag size is :"+bag8.size);
			bag8.quantity=6;
			System.out.println("the updated bag quantity is :"+bag8.quantity);
			
			BagRunner bag9=new BagRunner();
			bag2.price=2800;
			System.out.println("the updated bag price is :"+bag2.price);
			bag2.brand="Fastrack";
			System.out.println("the updated bag brand is :"+bag2.brand);
			bag2.size='M';
			System.out.println("the updated bag size is :"+bag2.size);
			bag2.quantity=5;
			System.out.println("the updated bag quantity is :"+bag2.quantity);
			
			BagRunner bag10=new BagRunner();
			bag2.price=6500;
			System.out.println("the updated bag price is :"+bag2.price);
			bag2.brand="Tommy Hilfiger";
			System.out.println("the updated bag brand is :"+bag2.brand);
			bag2.size='S';
			System.out.println("the updated bag size is :"+bag2.size);
			bag2.quantity=4;
			System.out.println("the updated bag quantity is :"+bag2.quantity);
			System.out.println("the update of the bag will end");
			
		}

}