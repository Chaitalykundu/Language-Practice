// Online C++ compiler to run C++ program online
#include <iostream>
#include <utility>

using namespace std;
int explainPair()
{

    pair<int, string> p(1, "Chaitaly"), q(2, "Ankita");
    cout << "Before swapping:\n";
    cout << p.first << " " << p.second << endl;
    cout << q.first << " " << q.second << endl;

    p.swap(q);
    cout << "\n\nAfter swapping:\n";
    cout << p.first << " " << p.second << endl;
    cout << q.first << " " << q.second << endl;
}

int main()
{
    // Write C++ code here
    explainPair();

    return 0;
}

/*

O.P. :

Before swapping:
1 Chaitaly
2 Ankita


After swapping:
2 Ankita
1 Chaitaly


*/