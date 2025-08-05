//menu driven code
#include <stdio.h>

int main() {
    int choice, num, i, temp, rev = 0, sum = 0, digit, flag = 0;

    printf("Enter a number: ");
    scanf("%d", &num);

    printf("\nSelect an operation:\n");
    printf("1. Check Even or Odd\n");
    printf("2. Check Prime or Not\n");
    printf("3. Check Palindrome or Not\n");
    printf("4. Check Positive, Negative or Zero\n");
    printf("5. Reverse the Number\n");
    printf("6. Sum of Digits\n");
    printf("Enter your choice (1-6): ");
    scanf("%d", &choice);

    // Perform selected operation
    if(choice == 1) {
        if(num % 2 == 0)
            printf("The number is Even.\n");
        else
            printf("The number is Odd.\n");
    }
    else if(choice == 2) {
        if(num < 2) {
            printf("Not a Prime Number.\n");
        } else {
            flag = 1;
            for(i = 2; i <= num / 2; i++) {
                if(num % i == 0) {
                    flag = 0;
                    break;
                }
            }
            if(flag == 1)
                printf("Prime Number.\n");
            else
                printf("Not a Prime Number.\n");
        }
    }
    else if(choice == 3) {
        temp = num;
        rev = 0;
        while(temp > 0) {
            digit = temp % 10;
            rev = rev * 10 + digit;
            temp = temp / 10;
        }
        if(rev == num)
            printf("Palindrome Number.\n");
        else
            printf("Not a Palindrome.\n");
    }
    else if(choice == 4) {
        if(num > 0)
            printf("Positive Number.\n");
        else if(num < 0)
            printf("Negative Number.\n");
        else
            printf("Zero.\n");
    }
    else if(choice == 5) {
        temp = num;
        rev = 0;
        while(temp > 0) {
            digit = temp % 10;
            rev = rev * 10 + digit;
            temp = temp / 10;
        }
        printf("Reversed Number = %d\n", rev);
    }
    else if(choice == 6) {
        temp = num;
        sum = 0;
        while(temp > 0) {
            digit = temp % 10;
            sum += digit;
            temp = temp / 10;
        }
        printf("Sum of digits = %d\n", sum);
    }
    else {
        printf("Invalid choice.\n");
    }

}

