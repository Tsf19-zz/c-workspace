class Pattern22
{
	public static void main(String args[])
	{
		for(int i=1;i<=5;i++)
		{
			char c='E';
			for(int j=1;j<=5;j++)
			{
				System.out.print(" "+c);
				c--;
			}
			System.out.println();
		}
	}
}