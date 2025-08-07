#include<stdio.h>
void main(){
	
	int unit,bill;
	printf("enter the number");
	scanf("%d",&unit);
	if(unit<=50)
	{
		bill=unit*30;
		printf("bill of%d is %d",unit,bill);
		
		
		
	}
	else if(unit>50&&unit<=150){
		
		
		bill = unit*30;
		printf("bill of %d id %d",unit,bill);
	}
	else if (unit>150)
	printf("bill of %d is %d",unit,bill);
	
	
}
	
	
	
	
	
	
	
	
	
	
	

