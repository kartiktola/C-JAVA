#include <iostream>
using namespace std;

void printInc(int st, int end){
    if (st==end+1)
        return;
    cout << st << " ";
    printInc(st+1, end);
}
void printDec(int st, int end){
    if (st==end+1)
        return;
    printDec(st+1, end);
    cout<<st<<" ";
}
int main(int args, char** argv){
    int st,end;
    cin>>st>>end;
    printInc(st,end);
    printDec(st,end);
}
