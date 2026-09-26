#include <iostream>
using namespace std;
/*
Static membership is a special type of membership 
where data/function only exists with the class, 
hence unique and singular. 

The most common use of static membership is providing 
a serial number or sequence number in real programming. 
*/

class Student
{
    public:
	static int count;
	int roll_no;
public:

    Student()
    {
        count++;
        roll_no=count;
        cout<<"\nNew student registered with roll no:"<<roll_no;
    }

    static void showCount()//Static function member :Can only access static data, nothing other than that. 
    {
        cout << "Total count till now is: " << count << endl;
        //Within the class we can directly write `count` or `class_name::count`. 
    }
};

// Define static data member outside the class
int Student::count;
//<dt> class::<var>=<initial value>;
int main()
{
    Student s1;
    
    s1.showCount();
    Student s2;
    s2.showCount();
    Student s3;
    Student::showCount();//Even a static member function has to be accessed using scope resolution. 
	cout<<"\nAccessing count:"<<Student::count;
		//When a static member is to be accessed outside the class, provided it is public, 
		//one must specify the name of the class, followed by scope resolution(::), 
		//followed by the name of the variable. 
    return 0;
}
