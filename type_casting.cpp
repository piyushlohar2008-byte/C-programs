#include<iostream>
using namespace std;
int main(){
	int a = 10;
	float b = 3.14;
	float c = a + b;
	cout<<"Implicit conversion : "<<c<<endl;
	int x;
	float y = 5.67;
	x=(int)y;
	cout<<"Explicit conversion : "<<x<<endl;
	char ch = 'a';
	int num = ch;
	cout<<"assignment compability : "<<num<<endl;
}

