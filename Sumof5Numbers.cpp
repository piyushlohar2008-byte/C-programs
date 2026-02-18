#include<iostream>
using namespace std;
int main(){
	float a,b,c;
	int ch;
	cout<<"1.Addition"<<endl;
	cout<<"2.substration"<<endl;
	cout<<"3.multiplication"<<endl;
	cout<<"4.division"<<endl;
	cout<<"Enter two numbers : ";
	cin>>a>>b;
	cout<<"Enter your choice : ";
	cin>>ch;
	switch(ch){
		case 1:c=a+b;
		cout<<"Addition is : "<<c;
		break;
		case 2:c=a-b;
		cout<<"substration is : "<<c;
		break;
		case 3:c=a*b;
		cout<<"Multiplication is : "<<c;
		break;
		case 4:c=a/b;
		cout<<"Division is : "<<c;
		break;
		default:cout<<"Wrong choice";
		break;
	}
}

