/* Author : Chaitaly Kundu
   Date : 18th june 2021 */

#include <iostream>

using namespace std;

void printPattern(int r)
{
    // Write Your Code here
    for (int i = 1; i <= r; i++)
    {
        for (int j = 1; j <= i; j++)
        {
            cout << j << " ";
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

Enter the no. of row and column: 5
5

1
1 2
1 2 3
1 2 3 4
1 2 3 4 5

*/