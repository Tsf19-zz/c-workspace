class PatternHW
{
	public static void main(String args[])
	{
		int c=7;
		for(int i=4;i>=1;i--)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(c+" ");
				c++;
			}
			System.out.println();
			c=c-2*i+1;
			
		}
	}
}