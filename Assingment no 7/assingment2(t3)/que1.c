#include <stdio.h>

// Function prototype using pointers
void calculater(double *num1, double *num2, char *operators);

int main()
{
    double num1, num2;
    char operators;

    printf("Enter a num1: ");
    scanf("%lf", &num1);
    printf("Enter a num2: ");
    scanf("%lf", &num2);
    printf("Enter an operator (+, -, *, /, %): ");
    scanf(" %c", &operators);

    calculater(&num1, &num2, &operators); // 
    return 0;
}

// Function definition
void calculater(double *num1, double *num2, char *operators)
{
    double result;

    if (*operators == '+') {
        result = *num1 + *num2;
        printf("%lf", result);
    }
    else if (*operators == '-') {
        result = *num1 - *num2;
        printf("%lf", result);
    }
    else if (*operators == '*') {
        result = *num1 * *num2;
        printf("%lf", result);
    }
    else if (*operators == '/') {
        if (*num2 != 0)
            result = *num1 / *num2;
        else {
            printf("Error: Division by zero!\n");
            return;
        }
        printf("%lf", result);
    }
    else if (*operators == '%') {
        result = (int)(*num1) % (int)(*num2); // typecast to int
        printf("%d", (int)result);
    }
    else {
        printf("Invalid operator!");
    }
}
