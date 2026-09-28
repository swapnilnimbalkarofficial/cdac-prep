#include<iostream>
#include<fstream>
using namespace std;
int main()
{
	ifstream fr("data.txt");
	char c;
	if(!fr.is_open()){
		cout<<"error in file";
		return 1;
	}
 	
 	//read file.
 	//single character, .get()
 	//single word.: >>
 	//single line: getline(fr,)
 	int count=0;
 	while(fr.get(c))//this line stop when error occur
 	{
 		cout<<c<<endl;	
	 }
 	//close file
  	fr.close();
  	cout<<"\nWriting done and file closed";

}