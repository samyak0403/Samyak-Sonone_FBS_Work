
//Accept the age and check if the person is:
//Child (age < 12),Teenager (12?19),Adult (20?59),Senior (60 and above)
#include<stdio.h>
void getAge(int);
void main(){
	int age;
	printf("Enter the Age:");
	scanf("%d",&age);
	getAge(age);
}
void getAge(int age){
	if(age<12){
		printf("Child");
	}else if (age>=12&&age<=19){
		printf("teenager");
	}else if(age>=20&&age<=59){
		printf("Adult");
		
	}else{
		printf("Senior");
	}
}
