#include<iostream>
using namespace std;
class Employee{
	public:
		string name;
		string dept;
		int age;
		void getinfo(string name,string dept,int age)
		{
			this->name = name;
			this->dept = dept;
			this->age = age;
		}
		void output()
		{
			cout<<"Employee name : "<<this->name<<endl;
			cout<<"Employee dept : "<<this->dept<<endl;
			cout<<"Employee age : "<<this->age<<endl;
		}
};
int main()
{
	Employee obj;
	Employee *ptr;
	ptr = &obj;
	ptr->getinfo("Piyush","CSE",17);
	ptr->output();
}
