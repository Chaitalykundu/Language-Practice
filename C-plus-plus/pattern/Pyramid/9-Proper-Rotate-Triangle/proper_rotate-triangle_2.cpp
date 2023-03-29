/* Author : Chaitaly Kundu
   Date : 29th March 2023 */

#include <iostream>

using namespace std;

void printPattern(int n)
{
    // Write your code here.
    for (int i = 1; i <= (2 * n - 1); i++)
    {
        int stars = i;
        if (i > n)
            stars = 2 * n - i;
        for (int j = 1; j <= stars; j++)
            cout << "*";
        cout << endl;
    }
}

int main()
{
    int row;
    cout << "Enter the no. of row: ";
    cin >> row;
    printPattern(row);

    return 0;
}

/*  O/P:
Enter the no. of row: 4

*
**
***
****
***
**
*

*/