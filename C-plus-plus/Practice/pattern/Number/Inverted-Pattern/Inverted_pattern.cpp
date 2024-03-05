/* Author : Chaitaly Kundu
   Date : 28th March 2023 */

#include <iostream>

using namespace std;

void printPattern(int n)
{
    // Write your code here.
    for (int i = 1; i <= n; i++)
    {
        for (int j = 1; j <= n - i + 1; j++)
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

Enter the no. of row: 5
1 2 3 4 5
1 2 3 4
1 2 3
1 2
1

*/