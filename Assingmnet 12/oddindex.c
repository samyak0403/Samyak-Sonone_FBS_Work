#include<stdio.h>
void main(){
	char str[]="mohit";
	int i=0,j=0;
	while(str[i]!='\0'){
		if(i%2==0){
			str[j++]=str[i];
//			j++;
		}
		i++;
		
}
	str[j]='\0';
	
	printf("%s",str);
}