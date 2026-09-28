#include<iostream>
using namespace std;

class Employee{
    protected:
        int empid;
        string name;
        
    public:
        Employee(int id, string n){
            empid=id;
            name=n;
        }
};
class Developer: public Employee{
    protected:
        string language;
        int experience;
        
    public:
        Developer(int id, string n, string l, int e): Employee(id,n){
            language=l;
            experience=e;
        }
};
class SeniorDeveloper: public Developer{
    private:
        int projectCount;
    public:
        SeniorDeveloper(int id, string n, string l, int e, int p): Developer(id,n,l,e){
            projectCount=p;
        }
        
        void display(){
            cout<<"\nEmployee ID: "<<empid;
            cout<<"\nName: "<<name;
            cout<<"\nProgramming Language: "<<language;
            cout<<"\nExperience: "<<experience<<" years";
            cout<<"\nProject Count: "<<projectCount;
            
            if(experience >= 5){
                cout<<"\nSenior";
            }
            else if(experience >= 3){
                cout<<"\nMid-Level";
            }
            else{
                cout<<"\nJunior";
            }
        }
};
int main(){
    
    SeniorDeveloper s(101,"Swapnil","Java",6,8);
    s.display();
    return 0;
}