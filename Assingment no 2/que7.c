#include<stdio.h>
void main()
{
	int age  = 48;
	if(age<12)
	{
		printf("person is child");
	}
	else
	{
		if(age<=19)
		{
			printf("person is teenage");
		}
		else
		{
			if(age<=59)
			{
				printf("person is adult");
	
			}
			else{
				if(age>60)
				{
					printf("person is senior");
				}
			}
		}
	}
	
	
	
	
	
	
	
	
	
	
}