#include<stdio.h>

void sort(int a[],int n)
{
	int i,j,t;
	for(j=0;j<n;j++)
		for(i=0;i<n-j;i++)
		{
			if(a[i]>a[i+1])
			{
				t=a[i];
				a[i]=a[i+1];
				a[i+1]=t;
			}
		}
}

void main()
{
	int a[]={9,0,3,4,1,2,5,7,8,6};
	int i,n=10;
	printf("Array to Sort is : ");
	for(i=0;i<n;i++)
	{
		printf(" %d",a[i]);
	}
	sort(a,n);
	printf("\n Sorted Array is : ");
	for(i=0;i<n;i++)
	{
		printf(" %d",a[i]);
	}	
}