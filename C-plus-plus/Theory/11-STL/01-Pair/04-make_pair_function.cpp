// Online C++ compiler to run C++ program online
#include <iostream>
#include <utility>

using namespace std;
int explainPair()
{

    pair<int, string> p;
    p = make_pair(2, "This is a string");
    cout << p.first << " " << p.second << endl;
}

int main()
{
    // Write C++ code here
    explainPair();

    return 0;
}

/*
O.P. : 2 This is a string
*/