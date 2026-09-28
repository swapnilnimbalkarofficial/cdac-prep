#include<iostream>
#include<fstream>
using namespace std;
int main()
{
	ifstream fr("India.txt");
	string line;
	if(!fr.is_open()){
		cout<<"error in file";
		return 1;
	}
 	
 	//read file.
 	//single character, .get()
 	//single word.: >>
 	//single line: getline(fr,)
 	int count=1;
 	while(getline(fr,line))//this line stop when error occur
 		cout<<endl<<"line:--->"<<count++<<"--->"<<line;
 	//close file
  	fr.close();
  	cout<<"\nWriting done and file closed";

}