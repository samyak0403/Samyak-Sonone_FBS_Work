//que1. write a program to print sum of  prime numbers in  given range 

#include <stdio.h>

#include<stdio.h>
#include<string.h>

void main()
{
    char str[45];
    int size;
    char temp;

    printf("Enter the string : ");
    scanf("%s", str);

    printf("Before : %s\n", str);

    size = strlen(str);

    if(size > 1)
    {
        temp = str[0];
        str[0] = str[size-1];
        str[size-1] = temp;
    }

    printf("After : %s", str);
}
