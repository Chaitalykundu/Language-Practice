#include<iostream>

using namespace std;

//User function Template for C++
class Solution
{
public:
    void printTillN(int N)
    {
        // Write Your Code here
        if(N>0){
            printTillN(N-1);
            cout << N << " ";
        }
    }
};

int main(){
    int n;
    cout << "Enter the number : ";
    cin >> n;
    cout << naturalNumber(n) << " ";
}
