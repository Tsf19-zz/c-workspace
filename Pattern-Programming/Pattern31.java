class Pattern31
{
	public static void main(String args[])
	{
		for(int i=1;i<=4;i++)
		{
			char ch='D';
			for(int j=1;j<=4-i;j++)
			{
				System.out.print("  ");
			}
			for(int j=1;j<=i;j++)
			{
				System.out.print(" "+ch);
				ch--;
			}
			System.out.println();
		}
		for(int i=1;i<=3;i++)
		{
			char ch='D';
			for(int j=1;j<=i;j++)
			{
				System.out.print("  ");
			}
			for(int j=1;j<=4-i;j++)
			{
				System.out.print(" "+ch);
				ch--;
			}
			System.out.println();
		}
	}
}
