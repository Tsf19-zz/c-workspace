class Pattern26
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
			for(int j=1;j<=i;j++)
			{
				System.out.print(" "+(char)(ch+i-j));
			}			
			for(int j=1;j<=i-1;j++)
			{
				System.out.print(" "+(char)(ch+j));
			}
			System.out.println();
			
		}
	}
}