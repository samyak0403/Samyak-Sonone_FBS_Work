
//1. Find minimum and maximum number in array.

#include<stdio.h>

void main(){
	int arr[]={10,20,30,80,50};
	int max =arr[0];
	int min = arr[0];
	
	for(int i=1; i<5; i++){
		
		if(arr[i]>max){
			max = arr[i];
			
			if(arr[i]<min){
				
			min = arr[i];
			}
		}
	}
	printf(" max %d\n",max);
		printf(" min %d\n",min);
}