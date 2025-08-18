#include<stdio.h>
void main()
{
	int num1,num2,fact=1;
	printf("enter two numbers");
	scanf("%d%d",&num1,&num2);
	for(;num1<=num2;num1++)
	{
		printf("\n%d:",num1);
		for(int i=1;i<=num1;i++)
		{
			if(num1%i==0)
			{
				printf("\t%d",i);
			}
		}
	}
	
}