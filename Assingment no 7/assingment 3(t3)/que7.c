#include <stdio.h>

void factorial(int *no, int *i, int *fact);

int main()
{
    int no, i, fact = 1;
    printf("Enter a number: ");
    scanf("%d", &no);
    factorial(&no, &i, &fact);
    return 0;
}

void factorial(int *no, int *i, int *fact)
{
    *i = *no;
    while (*i > 1)
    {
        *fact = (*fact) * (*i);
        (*i)--;
    }

    printf("Factorial: %d", *fact);
}
