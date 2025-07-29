#include <stdio.h>
void main()

{
	int no =123;
	int r1,r2,r3, sum, rev;
	int q1;
	r1 = no%10;
	q1=no/10;
	r2 =q1%10;
	r3 = q1/10;
	
	rev = r1*100+r2*10+r3;
	sum = r1+r2+r3;
	if(no==rev){
		printf(" number is pallindrome");
	}
	else{
		printf("number is not pallindrome");
	}
}