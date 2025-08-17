#include <stdio.h>

void studentdiscount(int *price, char *ch);

int main()
{
    int price;
    char ch;

    printf("Enter a price: ");
    scanf("%d", &price);

    printf("Are you a student (y,n): ");
    scanf(" %c", &ch);

    studentdiscount(&price, &ch);

    return 0;
}

void studentdiscount(int *price, char *ch)
{
    int discount = 0, finalprice;

    if (*ch == 'y') {
        if (*price > 500) {
            discount = (*price * 20) / 100;
        } else {
            discount = (*price * 10) / 100;
        }
    }
    else if (*ch == 'n') {
        if (*price > 600) {
            discount = (*price * 15) / 100;
        } else {
            printf("Otherwise no discount\n");
            discount = 0;
        }
    }

    finalprice = *price - discount;
    printf("Discount: %d\n", discount);
    printf("Final Price: %d\n", finalprice);
}
