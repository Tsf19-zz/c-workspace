class Pattern28
{
	public static void main(String args[])
	{
		char ch='A';
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=5-i;j++)
			{
				System.out.print("  ");
			}
			for(int k=1;k<=i;k++)
			{
				System.out.print(" "+(char)(ch+k-1));
			}
			for(int l=1;l<=i-1;l++)
			{
				System.out.print(" "+(char)(ch+i-l-1));
			}
			System.out.println();
		}
	}
}