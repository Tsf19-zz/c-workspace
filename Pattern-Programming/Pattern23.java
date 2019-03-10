class Pattern23
{
	public static void main(String args[])
	{	
		int i,j;
		for(i=1;i<=9;i+=2)
		{
			for(j=1;j<=9-i;j++)
			{
				System.out.print(" ");
			}
			for(j=1;j<=i;j++)
			{
				System.out.print(" "+i);
			}
			System.out.println();
			
		}
	}
}