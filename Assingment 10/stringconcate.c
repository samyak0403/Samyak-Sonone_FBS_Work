
#include<stdio.h>
#include<string.h>
void main(){
	char  str1[10];
    char  str2[15];
	printf("Enter first String: ");
	scanf("%s",str1);
	
	printf("Enter Second String: ");
	scanf("%s",str2);
	
	printf("\nYou entered :\n");
	printf("String 1:%s\n",str1);
	printf("String 2:%s",str2);
	
	printf("\n<--Concate Strings of str1 and str2-->\n");
	printf("Concate string: %s",strcat(str1,str2));
 
	

}

 
