#include <stdio.h>

void sumofrange(int *no, int *i);

int main()
{
    int no, i = 1;
    printf("Enter a number: ");
    scanf("%d", &no);
    sumofrange(&no, &i);
    return 0;
}

void sumofrange(int *no, int *i)
{
    int sum = 0;

    while (*i <= *no) {
        sum += *i;
        (*i)++;
    }

    printf("Sum = %d", sum);
}
