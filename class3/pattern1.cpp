#include <iostream>
using namespace std;

void mirrorTriangle(int n){
    
    int nst=1;
    int nsp=n-1;
    for(int r=1; r<=n; r++)
    {
        for (int csp=1;csp<=nsp;csp++)
        {
            cout<<" ";
        }
        for (int cst=1;cst<=nst;cst++)
        {
            cout<<"*";
        }
        nst++;
        nsp--;
        cout<<endl;
    }
}
int main(){
    int n;
    cin>>n;
    mirrorTriangle(n);

}