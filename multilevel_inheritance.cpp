#include<iostream>
using namespace std;
class Employee{
	public:
		string name;
		string dept;
		void get()
		{
			cout<<"Enter name : ";
			cin>>name;
			cout<<"Enter department : ";
			cin>>dept; 
		}
		void show()
		{
			cout<<"Name : "<<name<<endl;
			cout<<"Deparatment : "<<dept<<endl;
		}
};
class person : public Employee{
	public:
		string name;
		string place;
		void getdata()
		{
			cout<<"Enter name : ";
			cin>>name;
			cout<<"Enter place : ";
			cin>>place;
		}
		void showdata()
		{
			cout<<"Name : "<<name<<endl;
			cout<<"Place : "<<place<<endl;
		}
};
class teacher : public person{
	public:
		string sub;
		string degree;
		void letdata()
		{
			cout<<"Enter subject : ";
			cin>>sub;
			cout<<"Enter degree : ";
			cin>>degree;
		}
		void display()
		{
			cout<<"Subject : "<<sub<<endl;
			cout<<"Degree : "<<degree<<endl;
		}
};
int main()
{
	teacher obj;
	obj.get();
	obj.getdata();
	obj.letdata();
	obj.show();
	obj.showdata();
	obj.display();
}
