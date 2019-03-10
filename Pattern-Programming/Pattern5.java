class Pattern5
{
	public static void main(String args[])
	{
		for(char i=0;i<7;i++)
		{
			for(int j=7;j>=1+i;j--)
			{
				System.out.print(j);
			}
			System.out.println();
			
		}
	}
}