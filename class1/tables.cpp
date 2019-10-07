#include<iostream>

using namespace std;
//this is so that we dont have to add "std::cout" everytime
int main (){
    cout<<"enter number whose table is required";
    int n;
    cin>>n;
    cout<<"enter number of repetitions";
    int len;
    cin>>len;

    for(int i=0; i<=len;i++)
    {
        cout<< n <<"X"<< i<< "="<<n*i<<endl;
        
    }

}