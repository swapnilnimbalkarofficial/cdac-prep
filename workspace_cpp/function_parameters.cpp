#include <iostream>
using namespace std;
void add(int no1,int no2)
{
	cout<<"\nAdding integers :"<<no1<<"+"<<no2<<"="<<(no1+no2);
}
void add(float no1,float no2)
{
	cout<<"\nAdding float :"<<no1<<"+"<<no2<<"="<<(no1+no2);
}
void add(int no1,int no2,int no3)
{
	cout<<"\nAdding 3 integers :"<<no1<<"+"<<no2<<"+"<<no3<<"="<<(no1+no2+no3);
}

float area(float radius)
{
    return 3.14 * radius * radius;
}

// Area of Rectangle
float area(float length, float breadth)
{
    return length * breadth;
}

int main()
{
    float r, l, b;

    cout << "Enter radius of circle: ";
    cin >> r;

    cout << "Area of Circle = " << area(r) << endl;

    cout << "\nEnter length of rectangle: ";
    cin >> l;

    cout << "Enter breadth of rectangle: ";
    cin >> b;

    cout << "Area of Rectangle = " << area(l, b) << endl;

    return 0;
}


