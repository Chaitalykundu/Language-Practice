#include<iostream>

using namespace std;

int main(){
    string s;
    cin >> s;

    int len;
    len = s.size();

    bool found=false;
    for(int i=0;i<len;i++){
        char a = s[i];
        if(a==s[i+1])
        {
            cout << s[i+1];
            found = true;
        }
    }

    if(found != true)
        cout << "-1";
    return 0;
}