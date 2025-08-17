#include <stdio.h>

void table(int *no, int *i);

int main()
{
    int no = 5, i = 1;
    table(&no, &i);
    return 0;
}

void table(int *no, int *i)
{
    int result;
    while (*i <= 10) {
        result = (*no) * (*i);
        (*i)++;
        printf("%d\n", result);
    }
}
