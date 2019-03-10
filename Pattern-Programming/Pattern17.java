class Pattern17
{
	public static void main(String args[])
	{
		//int a[][]=new int[][]{{0},{1,2},{3,4,5},{6,7,8,9},{10,11,12,13,14}};
		//OR
		int a[][]=new int[5][];
		a[0]=new int[1]; //NOT a[0]=new int[1][];
		a[1]=new int[2];
		a[2]=new int[3];
		a[3]=new int[4];
		a[4]=new int[5];
		a[0][0]=0;
		a[1][0]=1;
		a[1][1]=2;
		a[2][0]=3;
		a[2][1]=4;
		a[2][2]=5;
		a[3][0]=6;
		a[3][1]=7;
		a[3][2]=8;
		a[3][3]=9;
		a[4][0]=10;
		a[4][1]=11;
		a[4][2]=12;
		a[4][3]=13;
		a[4][4]=14;
		for(int i=0;i<=a.length-1;i++)
		{
			for(int j=0;j<=a[i].length-1;j++)
			{
				System.out.print(" "+a[i][j]);
			}
			System.out.println();
		}
	}
}