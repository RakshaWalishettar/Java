class boat{
	
}
class window{
	
}
class mouse{
	
}
class keyboard{
	
}
class table{
	
}
class InstanceRunner{
	public static void main(String[] args)
	{
		System.out.println("Implicitly creating 25 copies");
		new boat();new boat();new boat();new boat();new boat();
		new window();new window();new window();new window();new window();
		new mouse(); new mouse();new mouse(); new mouse();new mouse();
		new keyboard();new keyboard();new keyboard();new keyboard(); new keyboard();
		new table();new table();new table();new table();new table();
	}
}