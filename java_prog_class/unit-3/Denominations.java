/*Java program to take the input as amount in 
rupees and print their denominations and total number of 
notes*/
import java.util.*;
class Denominations
{
	public static void main(String args[])
	{
		int amount=0;
		int count =0,count1=0;
		int r500=0,r200=0,r100=0,r50=0,r20=0,r10=0,r5=0,r2=0,r1=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the amount: \n");
		amount = sc.nextInt();
		while(amount>=500)
		{
			r500 = amount/500;
			amount = amount%500;
			System.out.println("\nThe total number of 500 notes: "+r500);
			break;
		}
		while(amount>=200)
		{
			r200 = amount/200;
			amount = amount%200;
			System.out.println("\nThe total number of 200 notes: "+r200);
			break;
		}
		while(amount>=100)
		{
			r100 = amount/100;
			amount = amount%100;
			System.out.println("\nThe total number of 100 notes: "+r100);
			break;
		}while(amount>=50)
		{
			r50 = amount/50;
			amount = amount%50;
			System.out.println("\nThe total number of 50 notes: "+r50);
			break;
		}while(amount>=20)
		{
			r20 = amount/20;
			amount = amount%20;
			System.out.println("\nThe total number of 20 notes: "+r20);
			break;
		}while(amount>=10)
		{
			r10 = amount/10;
			amount = amount%10;
			System.out.println("\nThe total number of 10 notes: "+r10);
			break;
		}
		while(amount>=5)
		{
			r5 = amount/5;
			amount = amount%5;
			System.out.println("\nThe total number of 5rupee coins are: "+r5);
			break;
		}
		while(amount>=2)
		{
			r2 = amount/2;
			amount = amount%2;
			System.out.println("\nThe total number of 2rupee coins are: "+r2);
		break;}
		while(amount>=1)
		{
			r1 = amount/1;
			amount = amount%1;
			System.out.println("\nThe total number of 1rupee coins are: "+r1);
		break;}
		count =	r500+r200+r100+r50+r20+r10;
		count1 = r5+r2+r1;
		System.out.println("The total number of notes are: "+count);
		System.out.println("The total number of coins are: "+count1);
	}
}