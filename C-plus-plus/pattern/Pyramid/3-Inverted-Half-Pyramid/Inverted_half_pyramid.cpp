/* Author : Chaitaly Kundu
   Date : 14th june 2021 */

// In inverted half pyramid pattern the row and col number should be same. By default it'll take row number

#include <iostream>

using namespace std;

void printPattern(int r)
{
    // Write Your Code here
    for (int i = 1; i <= r; i++)
    {
        for (int j = r - i + 1; j >= 1; j--)
        {
            cout << "* ";
        }
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

Enter the no. of row: 5
* * * * *
* * * *
* * *
* *
*


*/