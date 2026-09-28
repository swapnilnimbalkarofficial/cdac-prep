#include<iostream>
#include<fstream>
#include<ctype.h>
using namespace std;

int main(){
	ifstream fr("India.txt");
	char ch;
	if(!fr.is_open()){
		cout<<"error in file";
		return 1;
	}
	
	int alphabet=0;
	int digit=0;
	int space=0;
	
	 while(fr.get(ch)){
    	if(isalpha(ch))
    	{
        	alphabet++;
    	}
    	else if(isdigit(ch))
    	{
        	digit++;
    	}
    	else if(isspace(ch))
    	{
        	space++;
    }
}
	cout<<"=========Data summary:======== "<<endl;
	cout<<"alphabet: "<<alphabet<<endl;
	cout<<"digit: "<<digit<<endl;
	cout<<"space: "<<space<<endl;
 	//close file
  	fr.close();
  	cout<<"\nWriting done and file closed";
	
}
