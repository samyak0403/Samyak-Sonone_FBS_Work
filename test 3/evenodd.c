//WAP Print even and odd numbers in a given range.
//eg. i/p: start= 10, end= 25
//o/p: odd: 11 13 15 17 19 21 23 25
//eg. i/p: start= 1, end= 15
//o/p: even: 2 4 6 8 10 12 14
//#include<stdio.h>
//void main() {
//	int start,end,ch;
//	do {
//		printf("enter start\n enter end");
//		scanf("%d %d",&start,&end);
//		printf("1.even \n 2.odd");
//		printf("\nenter your choice:");
//		scanf("%d",&ch);
//		if(ch==1) {
//			printf("this is even number:\n");
//			for(; start<=end; start++) {
//				if(start%2==0) {
//					printf("%d\n",start);
//				}
//
//			}
//		} else {
//			if(ch==2) {
//				printf("this is odd number:\n");
//				for(int no=start; no<=end; no++) {
//					if(no%2!=0) {
//						printf("%d\n",no);
//					}
//
//				}
//			}
//		}
//	}
//while(ch!=0);
//}
#include<stdio.h>
void main()
{
	int num1,num2;
	printf("enter two numbers");
	scanf("%d%d",&num1,&num2);
	for(;num1<=num2;num1++)
	{
		if(num1%2!=0)
		printf("\n%d",num1);
	}
	
}
