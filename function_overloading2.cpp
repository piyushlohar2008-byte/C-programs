#include<iostream>
using namespace std;
class Student{
	public:
		string name;
		int id;
		void getter()
		{
			cout<<"Enter name : ";
			cin>>name;
			cout<<"Enter ID : ";
			cin>>id;
		}
		void getter(string dept)
		{
			cout<<"Department : "<<dept<<endl;
		}
		void outter()
		{
			cout<<"Name : "<<name<<endl;
			cout<<"ID : "<<id<<endl;
		}
};
int main()
{
	Student obj;
	obj.getter();
	obj.outter();
	obj.getter("CSE");
}
