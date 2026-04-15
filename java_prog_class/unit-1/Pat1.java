/*Write a java program to print following pattern
1 
1 2
1 2 3 
1 2 3 4
1 2 3 4 5
*/
import java.io.*;
import java.util.*;
class Pat1
{
	public static void main(String args[])
	{
		int rows,i,j;
		System.out.print("Enter number of rows: ");
		Scanner sc = new Scanner(System.in);
		rows = sc.nextInt();
		for(i=1;i<=rows;i++)
		{
			for(j=1;j<=i;j++)
			System.out.print("  "+j);
			System.out.println(" ");
		}
	}
}