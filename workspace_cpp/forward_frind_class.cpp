#include <iostream>
using namespace std;

class Inches;

class Feet
{
private:
    int feet;

public:
    Feet()
    {
        feet = 9;
    }

    friend void display(Feet f, Inches i);
};

class Inches
{
private:
    int inches;

public:
    Inches()
    {
        inches = 0;
    }

    friend void display(Feet f, Inches i);
};

void display(Feet f, Inches i)
{
    i.inches = f.feet * 12;

    cout << "Feet = " << f.feet << endl;
    cout << "Inches = " << i.inches << endl;
}

int main()
{
    Feet f;
    Inches i;

    display(f, i);

    return 0;
}