#include <stdio.h>

void sumoffirstlast(int *no, int *ld, int *sum);

int main()
{
    int no, ld, sum;
    printf("Enter a number: ");
    scanf("%d", &no);
    sumoffirstlast(&no, &ld, &sum);
    return 0;
}

void sumoffirstlast(int *no, int *ld, int *sum)
{
    *ld = *no % 10;
    int temp = *no;

    while (temp >= 10) {
        temp = temp / 10;
    }

    *sum = *ld + temp;
    printf("Sum is %d", *sum);
}
