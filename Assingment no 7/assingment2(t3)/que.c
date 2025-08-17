#include <stdio.h>

void divisiblebyboth(int *num);

int main()
{
    int num;
    printf("Enter a number: ");
    scanf("%d", &num);
    divisiblebyboth(&num);
    return 0;
}

void divisiblebyboth(int *num)
{
    if (*num % 3 == 0 && *num % 5 == 0) {
        printf("Divisible by both");
    }
    else if (*num % 3 == 0 && *num % 5 != 0) {
        printf("Divisible by 3 but not by 5");
    }
    else if (*num % 3 != 0 && *num % 5 == 0) {
        printf("Divisible by 5 but not by 3");
    }
    else {
        printf("Divisible by None");
    }
}
