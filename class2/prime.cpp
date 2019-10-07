#include<iostream>

using namespace std;

void isPrime(int n){
    bool flag= false;
    for(int i =2;i*i<=n; i++)
    {
        if(n%i==0) 
        {
            flag=true;
            break;
        }
    }
    if (flag==false)
        cout<<"prime!"<<endl;
    else{
        cout<<"not prime"<<endl;
    }
}
int main(){
    cout<<"enter a no.";
    int n;
    cin>>n;
    isPrime(n);
}