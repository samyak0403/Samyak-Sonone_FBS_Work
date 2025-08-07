#include<stdio.h>
void main()
{
    int no=5;
    for(int i=0;i<no;i++)
    {
        for(int j=0;j<no;j++)
        {
            //if(i == 0||i == no-1||j == 0||j == no-1||i == j||i+j == no-1)
            if(i == 0||j==0||i==no-1||j==no-1)
                printf("* ");
            else
                printf("  ");
        }
        printf("\n");
    }
}
