class PatternKite
{
	public static void main(String args[])
	{
		int i,j,k;
		for(i=6;i>=1;i--)
		{
			for(j=i-1;j>=1;j--)
			{
				System.out.print(" ");
			}
			for(k=1;k<=(((6-i)+1)*2)-1;k++)
			{
				System.out.print("*");
			}
		System.out.println();
			
		}
		for(i=6;i>=1;i--)
		{
			for(j=1;j<=(6-i)+1;j++)
			{
				System.out.print(" ");
			}
			for(k=1;k<=(i*2)-1;k++)
			{
				System.out.print("*");
			}
		System.out.println();
			
		}			
	}
	
}

/*
-----*
----***
---*****
--*******
-*********
***********
***********
-*********
--*******
---*****
----***
-----*
*/