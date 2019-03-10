import java.util.Scanner;
class PatternHWGenric
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the number of rows: ");
		int n=sc.nextInt();
		System.out.println();
		for(int i=n;i>=1;i--)
		{
			int c=(i*(i+1))/2;
			for(int j=1;j<=i;j++)
			{
				System.out.print(((c-i)+1)+"  ");
				c++;
			}
			System.out.println();
			c=c-2*i+1;
			
		}
	}
}