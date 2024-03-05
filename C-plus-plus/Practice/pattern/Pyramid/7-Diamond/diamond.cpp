/* Author : Chaitaly Kundu
   Date : 28th March 2023 */

#include <iostream>

using namespace std;

//  count space > star > space
void upperPart(int n)
{
    // Write your code here.
    for (int i = 1; i <= n; i++)
    {
        // count space
        for (int j = 1; j <= (n - i); j++)
        {
            cout << " ";
        }
        // count star
        for (int j = 1; j <= (2 * i - 1); j++)
        {
            cout << "*";
        }
        // count space
        for (int j = 1; j <= (n - i); j++)
        {
            cout << " ";
        }
        cout << endl;
    }
}
void lowerPart(int n)
{
    // Write your code here.
    for (int i = n; i >= 1; i--)
    {
        // count space
        for (int j = 1; j <= (n - i); j++)
        {
            cout << " ";
        }
        // count star
        for (int j = 1; j <= (2 * i - 1); j++)
        {
            cout << "*";
        }
        // count space
        for (int j = 1; j <= (n - i); j++)
        {
            cout << " ";
        }
        cout << endl;
    }
}

int main()
{
    int row;
    cout << "Enter the no. of row: ";
    cin >> row;
    upperPart(row);
    lowerPart(row);

    return 0;
}

/*  O/P:

Enter the no. of row: 6
     *
    ***
   *****
  *******
 *********
***********
***********
 *********
  *******
   *****
    ***
     *

*/