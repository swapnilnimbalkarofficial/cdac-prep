#include <iostream>
using namespace std;

class PersonalInfo
{
    protected:
        string name;
        int age;
    public:
        void getPersonalInfo(string n, int a){
            name = n;
            age = a;
        }
};

class AcademicInfo
{
    protected:
        int roll_no;
        float marks;
        float total_marks;
    public:
        void getAcademicInfo(int r, float m, float t){
            roll_no = r;
            marks = m;
            total_marks = t;
        }
};

class Student : public PersonalInfo, public AcademicInfo
{
    private:
        float percentage;
    public:
        void calculate(){
            percentage = (marks / total_marks) * 100;
        }
        void display(){
            cout << "\nName: " << name;
            cout << "\nAge: " << age;
            cout << "\nRoll_No: " << roll_no;
            cout << "\nMarks: " << marks;
            cout << "\nTotal Marks: " << total_marks;
            cout << "\nPercentage: " << percentage;
        }
};

int main()
{
    Student s;
    s.getPersonalInfo("swapnil Nimbalkar", 20);
    s.getAcademicInfo(25, 450, 500);
    s.calculate();
    s.display();

    return 0;
}