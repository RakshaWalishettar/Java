class Paperrun{
	public static void main(String[] args)
	{
		String paper="newspaper";
		Paper.writing(paper);
		
		String different="varity";
		Paper.shape(different);
		
		String drawing="sketch";
		Paper.Drawing(drawing);
		
		int size=10;
		String sciror="cutting";
		Paper.cutting(size,sciror);
		
		boolean copy=true;
		int number=5;
		Paper.printing(copy,number);
		
		double prize=10;
		String name="type";
		char word='P';
		Paper.recycle(prize,name,word);
		
		boolean print=false;
		int count=7;
		String brand="pll";
		Paper.reference(print,count,brand);
	}
}