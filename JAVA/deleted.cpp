/* Author : Chaitaly Kundu
   Date : 05-09-2021*/

#include<iostream>
using namespace std;


void reverseArray(int arr[], int start, int end)
{
    while (start < end) {
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
        start++;
        end--;
    }
}


int main(){

    int n =8;
    int a[n] = {1,2,3,4,5,6,7,8};


    reverseArray(a, 1, 6);

    for(int i=0;i<n;i++)
        cout << a[i] << " ";
    return 0;
}