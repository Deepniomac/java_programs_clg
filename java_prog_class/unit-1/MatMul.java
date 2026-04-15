//Write a java program to implement the matrix multiplication
class MatMul
{
	public static void main(String args[])
	{
		int [][]a = {{1,2},{3,4}};
		int [][]b = {{5,6},{7,8}};
		int [][]c = new int [2][2];
		int i,j,k;
		for(i=0;i<a.length;i++)
		{
			for(j=0;j<b.length;j++)
			{
				for(k=0;k<c.length;k++)
				{
						c[i][j] = c[i][j]+(a[i][k]*b[k][j]);
				}
			}
		}
		System.out.println(" ");
		System.out.println("A matrix is: ");
		for(i=0;i<a.length;i++)
		{
			for(j=0;j<b.length;j++)
			{
				System.out.print("  "+a[i][j]);
			}
			System.out.println("  ");
	}
	System.out.println(" ");
	System.out.println("B matrix is: ");
		for(i=0;i<a.length;i++)
		{
			for(j=0;j<b.length;j++)
			{
				System.out.print("  "+b[i][j]);
			}
			System.out.println("  ");
	}
	System.out.println(" ");
	System.out.println("C matrix is: ");
		for(i=0;i<a.length;i++)
		{
			for(j=0;j<b.length;j++)
			{
				System.out.print("  "+c[i][j]);
			}
			System.out.println("  ");
	}
}
}