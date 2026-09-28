#include<iostream>
using namespace std;

class Phone{
	protected:
		string brand;
		string model;
		long phoneNo;
	public:
		Phone(string brand, string model, long phoneNo){
			this->brand=brand;
			this->model=model;
			this->phoneNo=phoneNo;
		}
		
};
class Camera{
	protected:
		string c_resolution;
		int noLenses;
	public:
		Camera(string c_resoluti, int noLenses){
			this->c_resolution=c_resolution;
			this->noLenses=noLenses;
		}
};
class SmartPhone: public Phone, public Camera{
	protected:
		string specification;
	public:
		SmartPhone(string brand,string model,long phoneNo,string c_resolution,int noLenses)
			: Phone(brand,model,phoneNo), Camera(c_resolution,noLenses){
		}
	void display(){
		cout<<"\nBrand: "<<brand;
		cout<<"\nModel: "<<model;
		cout<<"\nPhone No: "<<phoneNo;
		cout<<"\nc_resolution: "<<c_resolution;
		cout<<"\nNo_Lenses: "<<noLenses;
	}
};

int main(){
	SmartPhone sp("Iphone","17",9604329196, "64MP", 4);
	sp.display();
}