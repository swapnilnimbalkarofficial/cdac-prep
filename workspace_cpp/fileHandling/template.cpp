#include<iostream>
using namespace std;

template<typename T>
{
	return (x>y)? x:y;
}

int main(){
	cout<<myMax<int>(3,7)<<endl;
	cout<<myMax<char>('a','e')<<endl;
	return 0;
}