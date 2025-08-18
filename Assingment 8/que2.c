
//2. Search the given number in array.

#include <stdio.h>


void main() {
    int arr[] = {8, 60, 75, 15, 24};
    int num;

    printf("Enter number to search: ");
    scanf("%d", &num);

    for (int i = 0; i < 5; i++) {
        if (arr[i] == num) {
            printf("%d no is found\n");
            return; 
        }
    }

    printf("%d no not found\n");
}
