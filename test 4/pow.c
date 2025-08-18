#include<stdio.h>
void main()
{
	int no,pow,sum=1;
	printf("enter the number:");
	scanf("%d",&no);
	printf("enter the power:");
	scanf("%d",&pow);
	for(int i=1;i<=pow;i++)
	{
		sum=no*sum;
	}
	printf("power=%d",sum);
}