#include<stdio.h>
#include<conio.h>
void main()
{
int x,y,i,f=0;
clrscr();
do
{
//y=1;
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
printf("\nPress 1 to Continue\nPress 0 to Exit\n ");
scanf("%d",&y);
if(y!=0 && y!=1)
printf("Invalid Choice, Try Again");
}
while(y);
//getch();
}