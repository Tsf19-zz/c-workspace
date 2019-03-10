#include<stdio.h>
#include<conio.h>
prime(x,i)
{
if(i==1)
	return 1;
else
{
	if(x%i==0)
	return 0;
	else
	return prime(x,i-1);
}
}
void main()
{
int x,i,f=0;
clrscr();
printf("\nEnter Number");
scanf("%d",&x);
if(x==0||x==1)
{
	printf("Not Prime");
}
else
{
	f=prime(x,x/2);

	if(f==1)
		printf("\nPrime");
	else
		printf("\nNot Prime");
}
getch();
}