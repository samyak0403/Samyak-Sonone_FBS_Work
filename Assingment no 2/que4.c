#include<stdio.h>
void main()
{
  int marks  = 34;
  if(marks>75)
  {
  	printf("Distinction");
  }
  else{
  	if(marks>65){
  		printf("first class");
	  }
	  else{
	  	if(marks>55)
	  	{printf("second class");
		  }
		  else{
		  	if(marks>40)
		  	{ printf("pass class");
			  }
			  else{
			  	if(marks<40)
			  	{printf("fail");
				  }
			  }
		  }
	  }
  }
	
	
	
}