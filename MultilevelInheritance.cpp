#include<iostream>
using namespace std;
class Person{
	public:
	string name;
	double salary;
		void get(){
			cout<<"Enter name : ";
			cin>>name;
			cout<<"Enter salary : ";
			cin>>salary;
		}
		void show(){
			cout<<"Name : "<<name<<endl;
			cout<<"Salary : "<<salary<<endl;
		}
};
class Student : public Person{
	public:
	int rollno;
		void let(){
			cout<<"Enter rollno : ";
			cin>>rollno;
		}
		void showdata(){
			cout<<"Rollno : "<<rollno<<endl;
		}
};
class Employee : public Student{
	public:
	int age;
		void getdata(){
			cout<<"Enter age : ";
			cin>>age;
		}
		void display(){
			cout<<"Age : "<<age<<endl;
		}
		
		
};
int main(){
	Employee obj;
	obj.get();
	obj.let();
	obj.getdata();
	obj.show();
	obj.showdata();
	obj.display();
}
