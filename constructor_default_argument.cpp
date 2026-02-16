#include<iostream>
using namespace std;
class student{
	private:
		string name;
		int age;
		public:
			student(string name = "unknown",int age = 0)
			{
				cout<<"Name : "<<name<<endl;
				cout<<"Age : "<<age<<endl;
			}
};
int main()
{
	student obj;
}
