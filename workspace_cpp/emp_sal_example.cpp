#include <iostream>
#include <string>
using namespace std;

class Employee {
protected:
    int empid;
    string name;
    float salary;
    int att_days;

public:
    Employee(int id, string n, float sal, int days) {
        empid = id;
        name = n;
        salary = sal;
        att_days = days;
    }
};

class Bonus : public Employee {
private:
    float bonus;
    float net_salary;

public:
    Bonus(int id, string n, float sal, int days)
        : Employee(id, n, sal, days) {

        if (att_days > 200)
            bonus = salary * 10 / 100;
        else
            bonus = salary * 6.5 / 100;

        net_salary = salary + bonus;
    }

    void display() {
        cout << "\nEmployee ID = " << empid;
        cout << "\nName = " << name;
        cout << "\nSalary = " << salary;
        cout << "\nAttendance Days = " << att_days;
        cout << "\nBonus = " << bonus;
        cout << "\nNet Salary = " << net_salary;
    }
};

int main() {

    Bonus b(101, "Amar", 50000, 210);

    b.display();

    return 0;
}