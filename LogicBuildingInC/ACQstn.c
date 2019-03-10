#include<stdio.h>
#include<string.h>
int main()
{
	int a,b,c,d,e,f;
	char str[]="";
	char *ptr=NULL;
	a=sizeof(str);
	b=sizeof(*str);
	c=strlen(str);
	d=sizeof(ptr);
	e=sizeof(*ptr);
	printf("\t str[0] ::%s::\n",str[0]);
	printf("\tsizeof(str) is : \t%d \n",a);			    // 1
	printf("\tsizeof(*str) is : \t%d \n",b); 		   // 1
	printf("\tstrlen(str) is : \t%d \n",c); 		  // 0
	printf("\tprintf(*str) is : \t%d \n",*str); 	 // 0
	printf("\tprintf(*str) is : \t%c \n",*str); 	 // 0
	printf("\tsizeof(ptr) is : \t%d \n",d); 	    // 8
	printf("\tsizeof(*ptr) is : \t%d \n",e); 	   // 1
	printf("\tprintf(*ptr) is : \t%P \n",*ptr);   //Segmentation fault (core dumped)
	f=strlen(ptr);
	printf("\tstrlen(ptr) is : \t%d \n",f);      //Segmentation fault (core dumped)
	
	return 0;
}