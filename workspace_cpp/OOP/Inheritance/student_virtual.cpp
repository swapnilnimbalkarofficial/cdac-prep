#include <iostream>
using namespace std;

class Student
{
	private:
    int roll_no;
    public:
    	void getRoll(int roll){
    		roll_no=roll;
		}
};

class Test:vitual public Student{
	private:
		int marks;
	public:
		void getMarks(int m){
			marks=m;
		}
};

class Sports: virtual public Student{
	private:
		int sportMarks;
	public:
		void getMarks(int sm){
			sportMarks=sm;
		}
};

class Result:public Test(marks), public Sports(sportMarks){
	public:
		
		void display(){
			cout<<"Marks: "<<marks;
			cout<<"Sports Marks: "<<sportMarks;
		} 
};

int main()
{
    Result r;
	r.display();

    return 0;
}