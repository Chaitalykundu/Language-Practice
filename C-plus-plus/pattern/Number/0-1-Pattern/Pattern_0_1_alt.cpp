/* Author : Chaitaly Kundu
   Date : 29th March 2023 */

#include <iostream>

using namespace std;

void printPattern(int n)
{
    // Write your code here.
    for (int i = 1; i <= n; i++)
    {
        for (int j = 1; j <= i; j++)
        {
            if (i % 2 != 0)
            {
                if (j & 1)
                {
                    cout << 1 << " ";
                }
                else
                {
                    cout << 0 << " ";
                }
            }

            else
            {
                if (j & 1)
                {
                    cout << 0 << " ";
                }
                else
                {
                    cout << 1 << " ";
                }
            }
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
Enter the no. of row: 4
1
0 1
1 0 1
0 1 0 1

*/