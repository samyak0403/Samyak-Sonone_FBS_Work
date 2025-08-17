#include <stdio.h>

void primrnotprime(int *no, int *flag, int *i);

int main()
{
    int no, flag = 0, i = 2;
    printf("Enter a number: ");
    scanf("%d", &no);
    primrnotprime(&no, &flag, &i);
    return 0;
}

void primrnotprime(int *no, int *flag, int *i)
{
    while (*i <= *no / 2)
    {
        if (*no % *i == 0) {
            *flag = 1;
            break;
        }
