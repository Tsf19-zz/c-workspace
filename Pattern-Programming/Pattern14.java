class Pattern14
{
	public static void main(String args[])
	{
		System.out.print("0 "); //Extra
		for(int i=1;i<=6;i++)
		{
			for(int k=1;k<=7-i;k++)
			{
				System.out.print("0 ");
			}
			System.out.println();
			for(int j=1;j<=i;j++)
			{
				System.out.print("0 ");
			}
			System.out.print(i+" ");

		}
	}
}