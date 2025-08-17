#include <stdio.h>

void perfect(int *no, int *i, int *sum);

int main()
{
    int no, i = 1, sum = 0;
    printf("Enter a number: ");
    scanf("%d", &no);
    perfect(&no, &i, &sum);
    return 0;
}

void perfect(int *no, int *i, int *sum)
{
    while (*i < *no)
    {
        if (*no % *i == 0) {
            *sum = *sum + *i;
        }
        (*i)++;
    }

    if (*sum == *no) {
        printf("Perfect number");
    } else {
        printf("Not Perfect number");
    }
}
