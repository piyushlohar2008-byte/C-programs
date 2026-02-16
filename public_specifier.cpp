#include<iostream>
using namespace std;
class person{
	public:
		string name;
		int age;
};
int main()
{
	person obj;
	obj.name = "Piyush";
	obj.age = 33;
	cout<<"Name : "<<obj.name<<endl;
	cout<<"Age : "<<obj.age;
}
