//Java program to read input integers from Command Line Arguments and print first 
//and second largest numbers
class Command
{
	public static void main(String args[])
	{
		int fl,sl,i,j,temp;
		int size = args.length;
		int [] b = new int [size];
			for(i=0;i<args.length;i++)
			
				b[i] = Integer.parseInt(args[i]);
			for(i=0;i<b.length-1;i++)
			{
				for(j=i+1;j<b.length;j++){
					if(b[i]<b[j])
					{
						temp = b[j];
						b[j] = b[i];
						b[i] = temp;
					}
				}	
			}
				fl = b[0];
				sl = b[1];
			System.out.println("The first largest number is: "+fl);
			System.out.println("The second largest number is: "+sl);
			
	}
}