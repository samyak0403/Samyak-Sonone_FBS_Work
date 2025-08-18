//WAP to add alternate numbers from given range.
//eg. i/p: start= 1, end= 5
//o/p: sum= 9
#include<stdio.h>
void main()
{
	int start,end,sum=0;
	printf("enter two numbers");
	scanf("%d%d",&start,&end);
		for ( ;start <= end; start+=2 )
		{
	    	sum=start+sum;
		}
		printf("%d\n",sum);
	
}