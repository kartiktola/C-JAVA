#include<iostream>
using namespace std;
int main(){
    cout<<"enter number";
    int num;
    cin>>num;
    int count=0;
    while(num!=0){
        num=num/10;
        count++;
    }
    cout<<count<<endl;
}