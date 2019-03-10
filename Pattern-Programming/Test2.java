class Test2
{
	public static void main(String args[])
	{
		Test1 obj=new Test1();
		obj.main1();
		for(int i=1;i<=5;i++)
		{
			for(int k=1;k<=i;k++)
			{
				System.out.print(" ");
			}
			for(int j=1;j<=5-i+1;j++)
			{
				System.out.print(j);
			}
			System.out.println();

		}
	}
}