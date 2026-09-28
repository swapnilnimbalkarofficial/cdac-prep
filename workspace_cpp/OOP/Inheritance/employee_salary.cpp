#include <iostream>
using namespace std;

class Employee {
protected:
    int empid;
    string name;
    float salary;
   
public:
    Employee(int id, string n, float sal) {
        empid = id;
        name = n;
        salary = sal;
    }
};

class Bonus : public Employee {
protected:
    float bonus;

public:
    Bonus(int id, string n, float sal): Employee(id, n, sal) {

        bonus = salary * 10 / 100;
    }
};
class Insentive:public Bonus{
	
	double net_salary;
	public:
	Insentive(int id, string n, float sal) : Bonus(id, n, sal) {

        net_salary = salary + bonus;
    }
	
	void display() {
        cout << "\nEmployee ID: " << empid;
        cout << "\nName: " << name;
        cout << "\nSalary:" << salary;
        cout << "\nBonus:" << bonus;
        cout << "\nNet Salary: " << net_salary;
    }
};


int main() {

    Insentive b(101, "swapnil", 50000);

    b.display();

    return 0;
}