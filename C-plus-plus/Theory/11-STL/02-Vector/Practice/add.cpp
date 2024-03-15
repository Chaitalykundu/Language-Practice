#include <iostream>
#include <vector>

using namespace std;

int main()
{
    vector<int> num{1, 2, 4, 5};

    int n = num.size();

    // Printing initial vector

    cout << "Initial Vector: ";

    for (int i = 0; i < n; i++)
    {
        cout << num[i] << "  ";
    }

    cout << endl;

    // add the integers 8 and 9 to the vector

    num.push_back(8);
    num.push_back(9);

    // Printing updated vector
    cout << "Updated Vector: ";

    for (auto i : num)
    {
        cout << i << "  ";
    }
}