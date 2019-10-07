#include<iostream>

using namespace std;

int main(){
    cout<<"enter number";
    int num;
    cin>>num;
    int rev=0;
    int temp;
    while (num!=0)
    {
        temp=num%10;   
        rev=rev*10+ temp;
        num=num/10;
    }
cout<<rev<<endl;
}