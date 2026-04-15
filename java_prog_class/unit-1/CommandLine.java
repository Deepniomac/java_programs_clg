//Program to implement the Command Line argument
class CommandLine
{
	public static void main(String args[])
	{
		System.out.println("The passed command line arguments are: ");
		for(int i=0;i<args.length;i++)
		System.out.println(" "+args[i]);
	}
}