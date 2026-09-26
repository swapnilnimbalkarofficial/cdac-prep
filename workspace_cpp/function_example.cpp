#include<iostream>
using namespace std;
//methods defines in global area 
void my_function()//type 1 not accepting and not returning
{
	cout<<"\n\t\thi i am my function: called by you";
}
void my_function2(string n)//type 2 accepting but not returning
{
	cout<<"\n\t\thi, "<<n;
}
string copyright()//type 3 not accepting but returning
{
	return "Code created by Amar Panchal. ";
}
string initials(string first_name,string last_name)//type 4 accepting and also returning 
{
	string init="";
	init+=first_name[0];
	init+=last_name[0];
	return init;
}
int main()
{
	cout<<"\nStart in the main part. ";
	cout<<"\nSome code, some logic. ";
	my_function();//function call
	my_function2("amar");
	void my_function3();
	cout<<"\n\t\tInfo:"<<copyright();
	cout<<"\n\t\tAmar Panchal initials:"<<initials("amar","panchal");
	cout<<"\nEnd in main part";
   return 0;
}

void my_function3()//type 1 not accepting and not returning
{
	cout<<"\n\t\thi i am my function: called by you";
}


//if we declare method in after main it gives error for prototype 