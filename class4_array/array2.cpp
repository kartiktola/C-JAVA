#include <iostream>

using namespace std;

int main() {
   // declaring sales array in C
   int arr[12];

   int i; // Variable for access sales array index
   cout << "Input into Array\n";

   for (i = 0; i < 10; i++) {
      // Reading User Input 
      cout << "Enter Value for position " << i << " : ";
      cin >> arr[i];
   }
   for (i = 0; i < 10; i++) {
      // Accessing value using for loop
      cout << arr[i]<<",";
   }
   return 0;
}