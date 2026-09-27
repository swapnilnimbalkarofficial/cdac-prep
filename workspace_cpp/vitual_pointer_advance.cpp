//class is called abstract class and method is called pure virtual method
#include <iostream>
using namespace std;

class Animal//A class having one or more pure virtual methods is called an abstract class and you cannot create an object of it. 
{
public:

    virtual void sound()=0;
//This is the way we create a pure virtual function, 
//which doesn't have any code, but it enforces, 
//in any class that inherits this class, that they should override a method called `sound`. 	
};
//Runtime polymorphism is the ability that gets activated only by a pointer, 
//which says a parent class pointer can refer to a child class object, 
//along with methods that are virtually defined. 
class Dog : public Animal
{
public:

    void sound()
    {
        cout << "Dog barks" << endl;
    }
};

class Cat : public Animal
{
public:

    void sound()
    {
        cout << "Cat meows" << endl;
    }
};

int main()
{
    Animal *ptr;
	//Animal a;
	//ptr=&a;
	//ptr->sound();//it refers to the sound of an animal. 
	
    Dog d;
    ptr = &d;
    ptr->sound();//it refer to the sound of a dog. 

    Cat c;
    ptr = &c;
    ptr->sound();//it should refer to the sound of a cat. 

    return 0;
}

