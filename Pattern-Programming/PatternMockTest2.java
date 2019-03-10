class PatternMockTest2
{
	public static void main(String args[])
	{
		for(int i=1;i<=5;i++)
		{
				if((i%2)!=0)
				{
					//int k=1;
					for(int j=1,k=1;j<=i;j++)
					{
						System.out.print(" "+k);
						k+=2;
					}
				}
				else
				{	
					//int k=2;
					for(int j=1,k=2;j<=i;j++)
					{
						System.out.print(" "+k);
						k+=2;
					}
				}
				System.out.println();
		}
	}
}

/*
1
2 4
1 3 5
2 4 6 8
1 3 5 7 9
*/