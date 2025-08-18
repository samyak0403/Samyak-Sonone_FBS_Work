//3. Find sum of all numbers.

#include<stdio.h>
void main(){
	int arr[]={10, 15, 32, 41};
	int sum =0;

	
	for( int i=0; i<4; i++)
	{
		sum = sum + arr[i];
	}
	printf("sum = %d\n",sum);	
		

}