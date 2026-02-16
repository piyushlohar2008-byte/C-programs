#include<iostream>
using namespace std;
class student{
	protected:
		string name;
		int rollno;
		int id;
};
class derrived:protected student{
	public:
		void getdata()
		{
			cout<<"Enter name : ";
			cin>>name;
			cout<<"Enter rollno : ";
			cin>>rollno;
			cout<<"Enter ID : ";
			cin>>id;
		}
		void display()
		{
			cout<<"Name : "<<name<<endl;
			cout<<"Rollno : "<<rollno<<endl;
			cout<<"ID : "<<id<<endl;
		}
};
int main()
{
	derrived obj;
	obj.getdata();
	obj.display();
}
