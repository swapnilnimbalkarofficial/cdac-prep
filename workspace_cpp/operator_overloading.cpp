/*
"What is operator overloading?"
Say:
Operator overloading is a feature of C++ that allows us to redefine the behavior of existing operators for 
user-defined data types such as classes and objects.

The operators ::, ., .*, ?:, sizeof, typeid, alignof, and noexcept cannot be overloaded.

"How can we overload an operator?"
Mainly through a member function or a non-member/friend function.
"Difference between member and friend operator?"
A member operator is called by the left-hand object and has a this pointer. A friend operator is 
a non-member function, receives operands as parameters, and can access private members when declared as a friend.

*/
#include <iostream>
using namespace std;

class Distance
{
private:
    int feet;
    int inches;

public:

    Distance(int f, int i)
    {
        feet = f;
        inches = i;
    }

    friend Distance operator+(Distance, Distance);

    void display()
    {
        cout << feet << " Feet "
             << inches << " Inches";
    }
};

Distance operator+(Distance d1, Distance d2)
{
    Distance temp(0, 0);

    temp.feet = d1.feet + d2.feet;
    temp.inches = d1.inches + d2.inches;

    if(temp.inches >= 12)
    {
        temp.feet++;
        temp.inches -= 12;
    }

    return temp;
}

int main()
{
    Distance d1(5, 8);
    Distance d2(3, 7);

    Distance d3 = d1 + d2;

    d3.display();

    return 0;
}
