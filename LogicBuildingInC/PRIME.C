#include<stdio.h>
//#include<conio.h>
//void main()
int main()
{
int x,i,f=0;
//clrscr();
printf("\nEnter Number : ");
scanf("%d",&x);
if(x==0||x==1)
{
	printf("\n%d is Not Prime",x);
}
else
{
	for(i=2;i<x;i++)
	{
		if((x%i)==0)
		{
			f=1;
			break;
		}

	}

	if(f==0)
		printf("\n%d is Prime",x);
	else
		printf("\n%d is Not Prime",x);
}
//getch();
return 0;
}