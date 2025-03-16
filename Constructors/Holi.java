class Holi{
	String FestivalName;
    String color;
    int year;
    String location;
    int participants;
    boolean isTraditional;
	
	Holi()
	{
		System.out.println("no-args const");
	}
	Holi(String FestivalName)
	{
		this.FestivalName=FestivalName;
		System.out.println("the FestivalName is const in Holic");
	}
	Holi (String FestivalName,String color)
	{
		this.FestivalName=FestivalName;
		this.color=color;
		System.out.println("the FestivalName ,color is const in Holi");
	}
	Holi(String FestivalName,String color,int year)
	{
		this.FestivalName=FestivalName;
		this.color=color;
		this.year=year;
		System.out.println("the FestivalName,color,year is const in Holi");
	}
	Holi(String FestivalName,String color,int year,String location)
	{
		this.FestivalName=FestivalName;
		this.color=color;
		this.year=year;
		this.location=location;
		System.out.println("the FestivalName,color,year,location is const in Holi");
	}
	Holi(String FestivalName,String color,int year,String location, int participants)
	{
		this.FestivalName=FestivalName;
		this.color=color;
		this.year=year;
		this.location=location;
		this.participants=participants;
		System.out.println("the FestivalName,color,year,loctaion,participants is const in Holi");
	}
	Holi(String FestivalName,String color,int year,String location, int participants, boolean isTraditional)
	{
		this.FestivalName=FestivalName;
		this.color=color;
		this.year=year;
		this.location=location;
		this.participants=participants;
		this.isTraditional=isTraditional;
		System.out.println("the FestivalName,color,year,location,participants,isTraditional is const in Holi");
	}
	void display()
	{
		System.out.println("details of Holi:");
		System.out.println("FestivalName :"+FestivalName);
		System.out.println("color :"+color);
		System.out.println("year :"+year);
		System.out.println("location :"+location);
		System.out.println("participants :"+participants);
		System.out.println("isTraditional :"+isTraditional);
		System.out.println("=================================");
	}
}