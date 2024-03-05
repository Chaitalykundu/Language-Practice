// Online C++ compiler to run C++ program online
#include <iostream>
#include <utility>

using namespace std;
int explainPair()
{
    // Way 1
    // defining a pair
    pair<int, char> a;

    // initializing the value of the pair
    a.first = 10;
    a.second = 'H';

    cout << a.first << " " << a.second << endl;

    // Way 2
    pair<string, char> b("Chaitaly", 'C');
    cout << b.first << " " << b.second << endl;

    // Way 3
    pair<double, string> p = {1.0, "Chaitaly"};
    cout << p.first << " " << p.second << endl;
}

int main()
{
    // Write C++ code here
    explainPair();

    return 0;
}