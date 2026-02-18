#include<iostream>
using namespace std;
class person{
	public:
		int age;
};
class student : public person{
	public:
		string name;
};
class teacher : public student{
	public:
		double salary;
};
int main(){
	teacher t1;
	t1.age = 24;
	t1.name = "Sharddha";
	t1.salary = 250000;
	cout<<"Age : "<<t1.age<<endl;
	cout<<"Name : "<<t1.name<<endl;
	cout<<"Salary : "<<t1.salary<<endl;
}
