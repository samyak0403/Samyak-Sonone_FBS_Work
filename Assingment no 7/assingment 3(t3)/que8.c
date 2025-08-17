#include <stdio.h>

void strong(int *num, int *reminder, int *fact, int *i, int *sum);

int main()
{
    int num, reminder, fact, i, sum = 0;
    printf("Enter a number: ");
    scanf("%d", &num);
    strong(&num, &reminder, &fact, &i, &sum);
    return 0;
}

void strong(int *num, int *reminder, int *fact, int *i, int *sum)
{
    int temp = *num;

    while (temp > 0) {
        *reminder = temp % 10;
        *fact = 1;
        *i = 1;

        while (*i <= *reminder) {
            *fact = (*fact) * (*i);
            (*i)++;
        }

        *sum = *sum + *fact;
        temp = temp / 10;
    }

    if (*sum == *num) {
        printf("Number is strong");
    } else {
        printf("Number is not strong");
    }
}
