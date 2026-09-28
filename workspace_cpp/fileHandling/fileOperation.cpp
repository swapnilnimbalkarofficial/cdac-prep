#include<iostream>
#include<fstream>
using namespace std;
int main()
{
	string name;
	string email;
	string phone;
	
	cout<<"Enter name";
	getline(cin,name);
	
	cout<<"Enter email";
	getline(cin,email);
	
	cout<<"Enter phone";
	getline(cin,phone);
	
	
	//create and open file
	ofstream fwrite(name+" .txt");
	//ofstream fwrite("data.txt");
	 //Enables append mode of the file. If the file is not there it will create and add data. 
    //If the file is already there it will go to the end of the file and start writing from there. 
    // Write data into file

	if(!fwrite.is_open())//if not open
	{
		cout<<"Error in opening file";
		return 1;
	}

	fwrite<<"\nName: "<<name;
	fwrite<<"\nEmail: "<<email;
	fwrite<<"\nPhone: "<<phone;
 
 	//close file
  	fwrite.close();
  	cout<<"\nWriting done and file closed";

}