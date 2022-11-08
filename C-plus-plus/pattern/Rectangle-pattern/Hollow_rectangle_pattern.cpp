/* Author : Chaitaly Kundu
   Date : 14th june 2021 */

#include<iostream>

using namespace std;

int main(){
    int row, col;
    cout << "Enter the no. of row and column: ";
    cin >> row >> col ;

    for(int i=1;i<=row;i++)
    {
        for(int j=1;j<=col;j++)
        {
            if(i==1 || i == row)
                cout << "* ";
            else{
                if(j==1 || j==col)
                    cout << "* ";
                else
                    cout << "  ";
            }
        }
        cout << endl ;
    }
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