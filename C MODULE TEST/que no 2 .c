//write a program to accept a string from user and replace one character from special symbmol

#include <stdio.h>

void main()
{
    char str[100];
    char oldChar, newChar;
    int i;

    printf("Enter a string : ");
    scanf("%s", str);

    printf("Enter character to replace : ");
    scanf(" %c", &oldChar);

    printf("Enter new character : ");
    scanf(" %c", &newChar);

    for(i=0; str[i]!='\0'; i++)
    {
        if(str[i]==oldChar)
        {
            str[i]=newChar;
        }
    }

    printf("String after replace : %s", str);
}

