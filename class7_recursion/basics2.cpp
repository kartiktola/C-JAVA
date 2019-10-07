#include <iostream>
using namespace std;

int printDec_returnType(int st, int end)
{
    if (st==end){
        cout << st << " ";
        return (st-1);
        }
    int head = printDec_returnType(st+1,end);
    cout<< head<<" ";
    return head - 1;
}
int fact(int n)
{
    if (n<=0)
        return 1;
    int a = fact(n-1);
    return a*n;
}



int main(int args, char** argv){
    int st,end;
    cin>>st>>end;
    printDec_returnType(st, end);
    
    int n;
    cin>>n;
    cout<<fact(n)<<endl;
}
