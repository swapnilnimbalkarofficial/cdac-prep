#include <iostream>
using namespace std;
//Default value parameter 
//A parameter which will only be used if the user does not provide 
//Values are given directly in the function definition and activated only if the user fails to provide. 

void display(string name, string nationality="Indian")
{
	cout << "Name: " << name << endl; cout << "Nationality: " << nationality << endl;
}

int main()
{
    string name, nationality;
    cout<<"Name: ";
    cin>>name;
    
    cout << "nationality (y/n): "; 
	char choice; 
	cin >> choice; 
	if(choice == 'y' || choice == 'Y') {
	 	cout << "Nationality: "; 
		cin >> nationality; display(name, nationality); 
		} 
	else { 
		display(name); 
	}
    
    return 0;
}
