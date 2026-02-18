#include<iostream>
using namespace std;
class person{
	public:
	double salary;
};
	class student : public person{
	public:
	int rollno;
};
	class teacher : public person{
	public:
	string sub;
};
	class son : public student{
	public:
	int age;
};
class TA : public student, public teacher{
};
int main(){
	TA t1;
	person p1;
	p1.salary = 25000;
	t1.rollno = 33;
	t1.sub = "C++";
	cout<<"Salary : "<<p1.salary<<endl;
	cout<<"Roll no : "<<t1.rollno<<endl;
	cout<<"Subject : "<<t1.sub<<endl;
}

