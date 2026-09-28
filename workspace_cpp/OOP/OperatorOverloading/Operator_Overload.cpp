#include <iostream>
using namespace std;

class Box{
    int a,b;

    public:
    void accept(int x, int y){
        a=x;
        b=y;
    }

    Box add(Box b1){
        Box z;
        z.a=b1.a+a;
        z.b=b1.b+b;
        return z;
    }
    
    void display(){
        cout<<a<<" "<<b<<endl;
    }

};

int main(){

    Box b1,b2,b3;
    b1.accept(6,7);
    b2.accept(6,8);
    b3=b1.add(b2);
    b3.display();
}