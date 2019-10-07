#include <iostream>
using namespace std;

void Triangle(int n){
    
    int nst=1;
    
    for(int r=1; r<=n; r++)
    {
        
        for (int cst=1;cst<=nst;cst++)
        {
            cout<<"*";
        }
        nst++;
        cout<<endl;
    }
}
int main(){
    int n;
    cin>>n;
    Triangle(n);

}
