class PostMaster{
	public static void men(String customername,String address)
	{
		System.out.println("works in post office");
	}
}
class Post{
	public static void HeadMaster(String customername,String address)
	{
		System.out.println("head of the post office");
		PostMaster.men(customername,address);
	}
}
class ReligionalPostOffice{
	public static void deliver(String customername,String address)
	{
		System.out.println("message are in the religious post office");
		Post.HeadMaster(customername,address);
	}
}
class SubRegionalPostOffice{
	public static void deliver(String customername,String address)
	{
		System.out.println("another sub office");
		ReligionalPostOffice.deliver(customername,address);
	}
}
class AreaPostOffice{
	public static void deliver(String customername,String address)
	{
		System.out.println("differnt area of post office");
		System.out.println("customername :"+customername);
		System.out.println("address :"+address);
		SubRegionalPostOffice.deliver(customername,address);
	}
}
class PostRunner{
	public static void main(String[] args)
	{
		String customername = "rani";
		String address = "opposite of the vinayak mandir , vijaynagar,banglore";
		AreaPostOffice.deliver(customername,address);
	}
}