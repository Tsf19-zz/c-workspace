class PatternFloydsTriangleABC
{
	public static void main(String args[])
	{
		char str='A'; 
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(str+" ");
				str++;
			}
			System.out.println();
		}
	}
}