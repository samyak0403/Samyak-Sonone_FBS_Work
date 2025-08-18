//5. Print alternate elements in array.

#include <stdio.h>

void main() {
    int arr[] = {5, 15, 20, 40, 70, 55};
    int no = 6;

    printf("Alternate elements: ");
    for (int i = 0; i < no; i += 2) { 
    
        printf("%d ", arr[i]);
    }
}
