class Colour{
	String name;
    int code;
    double shadeValue;
    String type;
    int intensity;
    double brightness;
	
	Colour()
	{
		System.out.println("no-args const");
	}
	Colour(String name)
	{
		this.name=name;
		System.out.println("the name is const in Pichkari");
	}
	Colour (String name,int code)
	{
		this.name=name;
		this.code=code;
		System.out.println("the name ,code is const in Pichkari");
	}
	Colour(String name,int code, double shadeValue)
	{
		this.name=name;
		this.code=code;
		this.shadeValue=shadeValue;
		System.out.println("the name,code,shadeValue is const in Pichkari");
	}
	Colour(String name,int code, double shadeValue,String type)
	{
		this.name=name;
		this.code=code;
		this.shadeValue=shadeValue;
		this.type=type;
		System.out.println("the name,code,shadeValue,type is const in Pichkari");
	}
	Colour(String name,int code, double shadeValue,String type,int intensity)
	{
		this.name=name;
		this.code=code;
		this.shadeValue=shadeValue;
		this.type=type;
		this.intensity=intensity;
		System.out.println("the name,code,shadeValue,type,intensity is const in Pichkari");
	}
	Colour(String name,int code, double shadeValue,String type,int intensity, double brightness)
	{
		this.name=name;
		this.code=code;
		this.shadeValue=shadeValue;
		this.type=type;
		this.intensity=intensity;
		this.brightness=brightness;
		System.out.println("the brand,code,shadeValue,type,intensity,brightness is const in Pichkari");
	}
	void display()
	{
		System.out.println("details of Colour:");
		System.out.println("name :"+name);
		System.out.println("code :"+code);
		System.out.println("shadeValue :"+shadeValue);
		System.out.println("type :"+type);
		System.out.println("intensity :"+intensity);
		System.out.println("brightness :"+brightness);
		System.out.println("=================================");
	}
}