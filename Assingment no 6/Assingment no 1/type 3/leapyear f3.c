
#include <stdio.h>
void LeapYear(int );
int main() {
    int year;

    printf("Enter a year: ");
    scanf("%d", &year);
   LeapYear(year);
}

void LeapYear(int year){
	 if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
        printf("%d is a Leap Year.\n", year);
    } else {
        printf("%d is NOT a Leap Year.\n", year);
    }
}
