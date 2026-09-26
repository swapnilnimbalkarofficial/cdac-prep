#include <iostream>
#include <string>
#include<iomanip>
using namespace std;
 
int main() {
//    string name;
//    cout<<"Enter names only 4-6 characters\n";
   // cin>>setw(6)>>name;//The time of taking input, seed, and width can decide the number of characters to be taken. 
    //cout<<"\nName is:"<<name;
//   cout<<endl<<setw(20)<<"amar";
//   cout<<endl<<setw(20)<<setfill('$')<<"amar";
   cout<<endl;
   for(int i=1; i<5; i++){
   	cout<<endl<<setw(i)<<"X";
   	cout<<setfill('X')<<" ";
   }
    return 0;
}

