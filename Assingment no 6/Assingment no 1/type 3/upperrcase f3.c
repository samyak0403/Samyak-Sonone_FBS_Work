
//Write a program to check whether a given character is uppercase or lowercase.
#include<stdio.h>
void	UppercaseLowercase(char );
void main(){
	char ch;
	printf("Enter character: ");
	scanf("%c",&ch);
	
	UppercaseLowercase(ch);
}
void	UppercaseLowercase(char ch){
	if(ch>='A' && ch<='Z'){
		printf("Upeercase character");
	}else if(ch>='a' && ch<='z'){
	
		printf("Lowercase character");
		
	}else{
		printf("The character is not an alphabet letter.");
	}
	}
