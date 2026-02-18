#include<iostream>
using namespace std;
class person{
	public:
		string name;
		int age;
};
class student : public person{
	public:
		int id;
	void getinfo(){
		cout<<"Name : "<<name<<endl;
		cout<<"Age : "<<age<<endl;
		cout<<"ID : "<<id<<endl;
	}
	~student(){
		cout<<"Hi i am destructor"<<endl;
	}
};
int main(){
	student s1;
	s1.name = "Piyush";
	s1.age = 18;
	s1.id = 494;
	s1.getinfo();
}
