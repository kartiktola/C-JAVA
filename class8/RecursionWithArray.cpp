#include <iostream>
#include <vector>

using namespace std;

void display(vector<int>&arr,int vidx){
    if (vidx== arr.size(1))
        return;
    cout<<arr[vidx]<<" ";
    display(arr,vidx+1);
}
bool find(vector<int> &arr, int vidx, int data){
    if (vidx==arr.size())
        return false;
    if (arr[vidx]== data)
        return true;
    return find (arr,vidx+1,data);

}
int maximum(vector<int> &arr, int vidx){
    if (vidx==arr.size()-1){
        return arr[vidx];
    }
    int recAns=maximum(arr,vidx+1);
    return max(recAns, arr[vidx]);
}
int minimum(vector<int> &arr, int vidx){
     if (vidx==arr.size()-1){
        return arr[vidx];
    }
    int recAns=minimum(arr,vidx+1);
    return min(recAns, arr[vidx]);
}
int lastIndex(vector<int> &arr,int vidx,int data)
{   if(vidx==arr.size()){
        return -1;
    }
    int recAns=lastIndex(arr, vidx+1, data);
    if (recAns!=1)
        return recAns;
    else
        return (arr[vidx]== data) ? vidx : -1;
}

int main(int args, char** argv)
{   
    int data,vidx;
    vector<int> arr;
    for(int i=0;i<7;i++){
    int val; cin>>val;
     arr.push_back(val);
    }
    data=8;
    display(arr,0);
    cout<<find(arr,vidx,data)<<endl;
    cout<<lastIndex(arr,vidx,data)<<endl;
    cout<< maximum(arr, vidx)<<endl;
    cout<< minimum(arr, vidx)<<endl;
}