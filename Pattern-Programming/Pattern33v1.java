class Pattern33v1
{
	public static void main(String args[])
	{
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=i-1;j++)
			{
				System.out.print(" ");
			}
			System.out.print((5-i+1));
			for(int j=1;j<((5-i)*2);j++)
			{
				System.out.print(" ");
			}
			if(i<5)
			System.out.print((5-i+1));
			System.out.println();
		}
	}
}