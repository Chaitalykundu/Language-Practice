/* Author : Chaitaly Kundu
   Date : 27th March, 2023 */

#include <iostream>

using namespace std;

void pattern(int row, int col)
{
    for (int i = 1; i <= row; i++)
    {
        for (int j = 1; j <= col; j++)
        {
            cout << "* ";
        }
        cout << endl;
    }
}

int main()
{
    int row, col;
    cout << "Enter the no. of row and column: ";
    cin >> row >> col;

    pattern(row, col);

    return 0;
}

/*  O/P:
Enter the no. of row and column: 3
4
* * * *
* * * *
* * * *


*/
