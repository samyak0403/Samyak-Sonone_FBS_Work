#include<stdio.h>
void main ()
{
	int a = 10;
	int b = 15;
	  int temp;
	  temp = a;
	  a =b;
	  b = temp;
	  printf("a =%d b=%d",a, b);
}