#include <iostream>
using namespace std;

class Human{
	private: 
	int age;
	string gender,name;
	
	
//	void canVote() {
//        if (age >= 18) {
//            cout << "\nYes, you can vote." << endl;
//        }
//        else {
//            cout << "\nNo, you can't vote." << endl;
//        }
//	}
	
	public:
		void set_details(string name, string gender, int age){
			this->name=name;
			this->gender=gender;
			this->age=age;
			cout<<"\nAll Data Set..";
		}
		
		void intro_human(){
			cout<<"\nHii I am "<<name<<", "<<gender<<"age "<<age;
			
			canVote();//we can function call inside function
			//nesting methods
			
		}
		
		void canVote() {
        if (age >= 18) {
            cout << "\nYes, you can vote." << endl;
        }
        else {
            cout << "\nNo, you can't vote." << endl;
        }
};

int main(){
	Human h;
	h.set_details("swapnil","male",24);
	h.intro_human();
	//h.canVote();
	h.canVote()
	return 0;
}