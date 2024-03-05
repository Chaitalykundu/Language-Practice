// Online C++ compiler to run C++ program online
#include <iostream>
#include <utility>

using namespace std;
int explainPair()
{

    pair<int, pair<int, int>> a = {1, {3, 4}};
    cout << a.first << " " << a.second.first;
}

int main()
{
    // Write C++ code here
    explainPair();

    return 0;
}

/*

O.P: 1 3

*/