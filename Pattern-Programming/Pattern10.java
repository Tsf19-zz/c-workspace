class Pattern10
{
	public static void main(String args[])
	{
		for(int i=1;i<=7;i++)
		{
			for(int k=1;k<=i;k++)
			{
				System.out.print(" ");
			}
			for(int j=i;j<=7;j++)
			{
				System.out.print(j+" ");
			}
			System.out.println();
		}
		for(int i=1;i<7;i++)
		{
			for(int k=1;k<=7-i;k++)
			{
				System.out.print(" ");
			}
			for(int j=7-i;j<=7;j++)
			{
				System.out.print(j+" ");
			}
			System.out.println();
		}
	}
}