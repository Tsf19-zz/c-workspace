#include<stdio.h>
//#include<conio.h>

void main()
{
int x,i,f=0;

printf("Enter the Number : ");
scanf("%d",&x);
if(x==0||x==1)
{
	printf("\nNot Prime");
}
else
{
	for(i=2;i<x;i++)
	{
		if(x%i==0)
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
	
}