#include<iostream>
using namespace std;

class A{
    protected:
        int a;
        
    public:
        void set(int a){
            this->a = a;
        }
        
        int square(){
            return a*a;
        }
};

class B{
    protected:
        int b;
        
    public:    
        B(){
        }
        
        void setB(int b){
            this->b = b;
        }
        
        int cube(){
            return b*b*b;
        }
};

class C : public A, public B{
    int answer;
public:
    void calculate(){
        answer = (a + b) * square() * cube();
    }
    void display(){
        cout << "Answer: " << answer;
    }
};
int main(){
    
    C c;
    c.set(2);
    c.setB(3);
    c.calculate();
    c.display();
    
    return 0;
}