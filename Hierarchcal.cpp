#include<iostream>
using namespace std;
class person{
	public:
	string name;
	int age;
	void get(){
		cout<<"Enter name : ";
		cin>>name;
		cout<<"Enter age : ";
		cin>>age;
	}
	void show(){
		cout<<"Name : "<<name<<endl;
		cout<<"Age : "<<age<<endl;
	}
};
class student : public person{
	public:
	int rollno;
	void getdata(){
		cout<<"Enter rollno : ";
		cin>>rollno;
	}
	void showdata(){
		cout<<"Rollno : "<<rollno<<endl;
	}
};
class teacher : public person{
	public:
	string sub;
	void let(){
		cout<<"Enter subject : ";
		cin>>sub;
	}
	void display(){
		cout<<"Subject : "<<sub<<endl;
	}
};
int main(){
	student obj1;
	teacher obj2;
	obj1.get();
	obj1.getdata();
	obj1.show();
	obj1.showdata();
	obj2.get();
	obj2.let();
	obj2.show();
	obj2.display();
}
