class Whatsapp{
	String version;
    double numberOfUsers;
    int fileSize;
	
	Whatsapp(String version,int fileSize,double numberOfUsers)
	{
		this.version=version;
		this.fileSize=fileSize;
		this.numberOfUsers=numberOfUsers;
		System.out.println("String,double,int param of Whatsapp ");
	}

}