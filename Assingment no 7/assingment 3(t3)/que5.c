#include <stdio.h>
#include <math.h>

void armstrong(int *no, int *digits, int *sum, int *rem, int *temp);

int main()
{
    int no, digits = 0, sum = 0, rem, temp;
    printf("Enter a number: ");
    scanf("%d", &no);
    armstrong(&no, &digits, &sum, &rem, &temp);
    return 0;
}

void armstrong(int *no, int *digits, int *sum, int *rem, int *temp)
{
    *temp = *no;
    while (*temp > 0)
    {
        *temp = *temp / 10;
        (*digits)++;
    }

    *temp = *no;
    while (*temp > 0)
    {
        *rem = *temp % 10;
        *sum = *sum + pow(*rem, *digits);
        *temp = *temp / 10;
    }

    if (*no == *sum) {
        printf("Armstrong");
    } else {
        printf("Not Armstrong");
    }
}
