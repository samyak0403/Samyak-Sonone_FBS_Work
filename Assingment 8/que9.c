
//9. Reverse the given array.
#include<stdio.h>
void main(){
	int arr[6];
	int size=sizeof(arr)/sizeof(int);
	
	printf("Enter elements of Array:");
	for(int i=0;i<size;i++){
		scanf("%d",&arr[i]);
	} 

		printf("Arr : [");
	for(int i=0;i<size;i++){
	
		printf(" %d,",arr[i]);
	}
		printf("\b ]");
		printf("\n");
		
		printf("Reverse of Given Array:\n");
			printf("Arr : [");
	for(int i=size-1;i>=0;i--){
	
		printf(" %d,",arr[i]);
	}
		printf("\b ]");
		printf("\n");
		
		
}
