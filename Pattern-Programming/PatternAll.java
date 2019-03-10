import pattern15;
class PatternAll
{
	public static void main(String args[])
	{
		//Pattern15 obj=new Pattern15(String args[]);
		//obj.mai();
		System.out.print("0 "); //Extra
		for(int a=1;a<=6;a++)
		{
			for(int b=1;b<=7-a;b++)
			{
				System.out.print("0 ");
			}
			System.out.println();
			for(int c=1;c<=a;c++)
			{
				System.out.print("0 ");
			}
			System.out.print(a+" ");

		}
	}
}