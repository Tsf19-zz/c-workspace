import java.util.Scanner;
class Pattern16
{
	public static void main(String args[])
	{
		int n=4;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Number of Rows to be Printed");
		n=sc.nextInt();
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=n-i;j++)
			{
				System.out.print("  ");
			}
			for(int k=1;k<=i;k++)
			{
				System.out.print(" 1");
			}			
			System.out.println();
		}
	}
}