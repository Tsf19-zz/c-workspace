class Pattern12
{
	public static void main(String args[])
	{
		for(int i=1;i<=7;i++)
		{	
			for(int j=1;j<=7;j++)
			{
				if(i%2==1)
					System.out.print(j%2);
				else
					System.out.print((j+1)%2);
			}
				System.out.println();
		}
	}
}