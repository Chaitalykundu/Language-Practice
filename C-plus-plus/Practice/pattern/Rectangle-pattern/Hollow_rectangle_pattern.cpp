/* Author : Chaitaly Kundu
   Date : 14th june 2021 */

#include <iostream>

using namespace std;

void printPattern(int r, int c)
{
    // Write Your Code here
    for (int i = 1; i <= r; i++)
    {
        for (int j = 1; j <= c; j++)
        {
            if (i == 1 || i == r || j == 1 || j == c)
                cout << "* ";
            else
                cout << "  ";
        }
        cout << endl;
    }
}

int main()
{
    int row, col;
    cout << "Enter the no. of row & col : ";
    cin >> row >> col;

    printPattern(row, col);

    return 0;
}

/*  O/P:

Enter the no. of row and column: 7
3
* * *
*   *
*   *
*   *
*   *
*   *
* * *


*/