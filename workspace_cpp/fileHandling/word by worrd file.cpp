#include<iostream>
#include<fstream>
using namespace std;
int main()
{
	ifstream fr("India.txt");
	string word;
	if(!fr.is_open()){
		cout<<"error in file";
		return 1;
	}
 	
 	//read file.
 	//single character, .get()
 	//single word.: >>
 	//single line: getline(fr,)
 	int count=0;
 	cout<<"\n[";
 	while(fr>>word)//this line stop when error occur
 	{
 		cout<<word<<",";	
	 }
	cout<<"]";
 	//close file
  	fr.close();
  	cout<<"\nWriting done and file closed";

}