/* Author : Chaitaly Kundu
   Date : 27th March, 2023 */

#include <iostream>

using namespace std;

void printPattern(int N)
{
    // Write Your Code here
    for (int i = 1; i <= N; i++)
    {
        for (int j = 1; j <= i; j++)
        {
            cout << "*";
        }
        cout << " ";
    }
}

int main()
{
    int row, col;
    cout << "Enter the no. of row : ";
    cin >> row;

    printPattern(row);

    return 0;
}
