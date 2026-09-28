#include <iostream>
using namespace std;

class FE {
protected:
    int roll;
    string name;
    float phu, chem, math;

public:
    FE(int r, string n, float p, float c, float m) {
        roll = r;
        name = n;
        phu = p;
        chem = c;
        math = m;
    }
};

class SE {
protected:
    float cpp, dbms, c;

public:
    SE(float c1, float cp, float d) {
        c = c1;
        cpp = cp;
        dbms = d;
    }
};

class TE {
protected:
    float java, web, msnet;

public:
    TE(float j, float w, float ms) {
        java = j;
        web = w;
        msnet = ms;
    }
};

class Result : public FE, public SE, public TE {
private:
    float total;
    float per;

public:
    Result(int r, string n, float p, float ch, float m,float c1, float cp, float d,
           float j, float w, float ms): FE(r, n, p, ch, m), SE(c1, cp, d), TE(j, w, ms) {

        total = phu + chem + math + c + cpp + dbms
              + java + web + msnet;

        per = total / 9;
    }

    void display() {
        cout << "\nRoll No: " << roll;
        cout << "\nName: " << name;

        cout << "\n\nFE Marks:";
        cout << "\nPhysics: " << phu;
        cout << "\nChemistry: " << chem;
        cout << "\nMath: " << math;

        cout << "\n\nSE Marks:";
        cout << "\nC: " << c;
        cout << "\nC++: " << cpp;
        cout << "\nDBMS: " << dbms;

        cout << "\n\nTE Marks:";
        cout << "\nJava: " << java;
        cout << "\nWeb: " << web;
        cout << "\nMS.NET: " << msnet;

        cout << "\n\nTotal: " << total;
        cout << "\nPercentage: " << per;
    }
};

int main() {

    Result r(101, "Swapnil",80, 75, 85,82, 78, 88,90, 85, 80);

    r.display();

    return 0;
}