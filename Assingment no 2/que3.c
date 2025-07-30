#include <stdio.h>
void main()
{ 
 int  x=25 , y =30, z= 45;
 if(x>y&&x>z)
 {printf("x is greater");
 }
 else{
 	if(y>x&&y>z)
 	{
 		printf("y is greater");
	 }
	 else{
	 	if(z>x&&z>y){
	 		printf("z is greater");
		 }
	 }
 }
}