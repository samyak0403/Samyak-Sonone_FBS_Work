#include <stdio.h>

void palindrom(int *num, int *temp, int *remainder, int *reverse);

int main()
{
    int num, temp, remainder, reverse = 0;
    printf("Enter a number: ");
    scanf("%d", &num);
    palindrom(&num, &temp, &remainder, &reverse);
    return 0;
}

void palindrom(int *num, int *temp, int *remainder, int *reverse)
{
    *temp = *num;

    while (*temp > 0) {
        *remainder = *temp % 10;
        *reverse = (*reverse) * 10 + *remainder;
        *temp = *temp / 10;
    }

    if (*reverse == *num) {
        printf("%d is palindrome", *num);
    } else {
        printf("%d is not palindrome", *num);
    }
}
