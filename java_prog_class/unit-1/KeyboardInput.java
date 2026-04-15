// Program to take the input from Keyboard

import java.io.* ;
import java.util.*;

class KeyboardInput 
{
	public static void main (String args[])
	{
		int tno, i;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Table number : ");
		tno = sc.nextInt();
		for (i = 1; i<=10; i++) 
			System.out.println(tno + "*" + i + "=" + tno*i);
		
	}
}