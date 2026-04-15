class Den2
{
	public static void main(String args[])
	{
		int notes[] = {500,200,100,50,20,10,5,2,1};
		int size = notes.length;
		int count[]= {0,0,0,0,0,0,0,0,0};
		
		int amount = 5263;
		for (int i = 0; i< notes.length; i++)
		{
			count[i] = amount / notes[i];
			amount = amount % notes[i];
			System.out.println("The number of "+ notes[i]+ "rupee notes are : "+ count[i]);
		}
		
	}
}