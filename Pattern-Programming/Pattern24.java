class Pattern24
{
	public static void main(String args[])
	{	
		for(int i=1;i<=9;i+=2)
		{
			for(int k=1;k<=9-i;k++)
			{
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++)
			{
				System.out.print(" "+(i-j+1));
			}
			System.out.println();
		}
	}
}