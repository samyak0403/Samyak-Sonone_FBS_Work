#include<stdio.h>
void main()
{
	int s1 =5;
	int s2 = 10;
	int s3 = 8;
	if(s1==s2&&s2==s3)
	{
		printf("it is equilateral traingle");
	}
	else{
		if(s1==s2||s2==s3||s1==s3)
		{printf("it is isoscles traingle");
		}
		else{
			if(s1!=s2&&s2!=s3&&s1!=s3);
			{printf("it is Scalene triangle");
			}
		}
	}
	
}