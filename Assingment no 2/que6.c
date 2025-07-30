#include<stdio.h>
void main()
{
	int no = 15;
	if(no%3==0&&no%5==0)
	{printf("number is divisible by both");
	}
	else{
		
		if(no%3==0&&no%5!=0)
		{
			printf("divisble by 3");
		}
		else{
			if(no%3!=0&&no%5==0){
				printf("number is divisible by none");
			}
		}
	}
	
	
	
	
	
	
	
	
	
}