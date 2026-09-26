#include <iostream>
using namespace std;

int Student::count;

int main()
{
    Student s[100];
    for (int i=0;i<3;i++)
    	{
    		cout<<"\nYour name:";
    		string name;
    		getline(cin,name);//getline is used to get entire name
    		cout<<"\nYour gender:";
    		string gender;
    		cin>>gender;
    		cin.ignore();
    		s[i].register_student(name,gender);
		}
	 cout<<"\nTotal Students Registered till now:"<<Student::get_count();
     cout<<"\nList is:\n";
	 for (int i=0;i<3;i++)
    	{
    	 s[i].display_student();
		}
	int r_number;
    cout<<"\nEnter number to search:";
    cin>>r_number;
    bool found=false;
    for(int i=0;i<Student::get_count();i++)
    {
    	if(r_number==s[i].get_roll())
    	{
    		cout<<"\nRecord found\n";
    		s[i].display_student();
    		found=true;
    		break;
		}
	}
	if(found==false)
		cout<<"\nNot found";
    return 0;
}
