#include<stdio.h>
#include<conio.h>
void main()
{
int m,n,i,f;
clrscr();
printf("Enter Two Integers m & n \n");
scanf("%d %d",&m,&n);
printf("The Prime Numbers between %d & %d are : \n",m,n);
while(m<=n)
{
	f=1;
	for(i=2;i<m;i++)
	{
		if(m%i==0)
		{
			f=0;
			break;
		}
	}
	if(f==1)
	{
		printf(" %d ",m);
	}
m++;

}

getch();
}