class Whiteboardrunner{
	public static void main(String[] args)
	{
		String text="words";
		Whiteboard.writing(text);
		
		String removing="clear";
		Whiteboard.erasing(removing);
		
		String content="imagination";
		Whiteboard.drawing(content);
		
		int size=100;
		String team="group";
		Whiteboard.organizing(size,team);
		
		boolean noattached=true;
		int count=5;
		Whiteboard.attaching(noattached,count);
		
		double time=10;
		String day="tuesday";
		char word='B';
		Whiteboard.scheduling(time,day,word);
		
		boolean nocollab=false;
		int cost=7;
		String brand="pll";
		Whiteboard.collaborating(nocollab,cost,brand);
	}
	
}