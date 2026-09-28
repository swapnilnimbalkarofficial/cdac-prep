#include<iostream>
#include<math.h>
using namespace std;

class ComplexOperatons;

class ComplexNumber{
    private:
    int real,imaginary;

    public:

    friend class ComplexOperatons;

    void accept(int x, int y){
        real=x;
        imaginary=y;
    }

    friend ComplexNumber operator+(ComplexNumber, ComplexNumber);
    friend ComplexNumber operator-(ComplexNumber, ComplexNumber);
    friend bool operator<(ComplexNumber, ComplexNumber);
    friend bool operator>(ComplexNumber, ComplexNumber);
    friend bool operator==(ComplexNumber, ComplexNumber);
    
    void display(){
        cout<<real<<" + "<<imaginary<<"i"<<endl;
    }
};

class ComplexOperatons{

};

ComplexNumber operator+(ComplexNumber c1, ComplexNumber c2){
    ComplexNumber z;
    z.real=c1.real+c2.real;
    z.imaginary=c1.imaginary+c2.imaginary;
    return z;
}

ComplexNumber operator-(ComplexNumber c1, ComplexNumber c2){
    ComplexNumber z;
    z.real=c1.real-c2.real;
    z.imaginary=c1.imaginary-c2.imaginary;
    return z;
}

bool operator<(ComplexNumber c1, ComplexNumber c2){
    double m1,m2;
    m1=sqrt(c1.real*c1.real+c1.imaginary*c1.imaginary);
    m2=sqrt(c2.real*c2.real+c2.imaginary*c2.imaginary);

    return m1<m2;
}

bool operator>(ComplexNumber c1, ComplexNumber c2){
    double m1,m2;
    m1=sqrt(c1.real*c1.real+c1.imaginary*c1.imaginary);
    m2=sqrt(c2.real*c2.real+c2.imaginary*c2.imaginary);

    return m1>m2;
}

bool operator==(ComplexNumber c1, ComplexNumber c2){
    return c1.real==c2.real && c1.imaginary==c2.imaginary;
}


int main(){
    ComplexNumber b1, b2, b3;
    b1.accept(6,7);
    b2.accept(5,9);
    
    b3=b1+b2;
    cout<<"\nAdd";
    b3.display();

    b3=b1-b2;
    cout<<"\nSub";
    b3.display();

    if(b1<b2){
        cout<<"\nb1 smaller magnitude";
    }
    else{
        cout<<"\nb1 does not smaller mangnitude";
    }

    if(b1>b2){
        cout<<"\nb1 smaller magnitude";
    }
    else{
        cout<<"\nb1 does not smaller mangnitude";
    }

    if(b1==b2){
        cout<<"\nBoth complex are equal";
    }
    else{
        cout<<"\nBoth complex numbers are not equal";
    }
    return 0;


}