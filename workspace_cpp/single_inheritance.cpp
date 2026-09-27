#include <iostream>
using namespace std;

class base {
private:
    int a, b;

protected:
    int c;

public:
    base() {
        a = 0;
        b = 0;
        c = 0;
    }

    base(int a1, int b1, int c1) {
        a = a1;
        b = b1;
        c = c1;
    }

    void show() {
        cout << "\nBase Class";
        cout << "\na = " << a;
        cout << "\nb = " << b;
        cout << "\nc = " << c;
    }
};
class sub : public base {
private:
    int p, q, r;

public:
    sub() {
        p = 5;
        q = 4;
        c = 10;
        r = (p * q) + c;
    }
    
    sub(int a1, int b1, int c1, int p1, int q1)
        : base(a1, b1, c1)
    {
        p = p1;
        q = q1;
        r = (p * q) + c;
    }

    void show() {
        base::show();
        cout << "\nDerived Class";
        cout << "\nAnswer = " << r;
    }
};

int main() {
    sub obj(10,20,30,4,5);
    obj.show();

    return 0;
}