/* Author: CHaitaly Kundu
Date: 19th May, 2021 */

/* Write a program to print multiple string without user input*/

#include<stdio.h>
int main()
{
    char name[20];

    printf("Enter full name: ");
    gets(name);     // scanf normally can't take 2 string at s time

    puts("Hello");
    puts(name);

    return 0;
}