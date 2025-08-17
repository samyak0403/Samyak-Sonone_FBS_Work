#include <stdio.h>


void evenodd(int *num);

int main()
{
    int num;
    printf("Enter a number: ");
    scanf("%d", &num);

    evenodd(&num); 
    return 0;
}


void evenodd(int *num)
{
    if (*num % 2 == 0)
    {
        printf("The number is even");
    }
    else
    {
        printf("The number is odd");
    }
}
