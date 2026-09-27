#include <iostream>
#include <string>
using namespace std;

class FE {
protected:
    int rollno;
    string name;
    int fe1, fe2, fe3;

public:
    void setFE(int r, string n, int m1, int m2, int m3) {
        rollno = r;
        name = n;
        fe1 = m1;
        fe2 = m2;
        fe3 = m3;
    }

    void getFE() {
        cout << "\nRoll No = " << rollno;
        cout << "\nName = " << name;
        cout << "\nFE Marks = " << fe1 << " " << fe2 << " " << fe3;
    }
};

class SE : public FE {
protected:
    int se1, se2, se3;
    int total;
    float per;

public:
    void setSE(int s1, int s2, int s3) {
        se1 = s1;
        se2 = s2;
        se3 = s3;

        total = fe1 + fe2 + fe3 + se1 + se2 + se3;
        per = total / 6.0;
    }

    void getSE() {
        cout << "\nSE Marks = " << se1 << " " << se2 << " " << se3;
        cout << "\nTotal = " << total;
        cout << "\nPercentage = " << per << "%";
    }
};

int main() {

    SE s;

    s.setFE(101, "abs", 80, 75, 90);
    s.setSE(85, 70, 95);

    s.getFE();
    s.getSE();

    return 0;
}