#include<iostream>
using namespace std;
class person{
	public:
		string name;
		int age;
	person(){
		cout<<"parent constructor"<<endl;
	}

};
class student : public person{
	public:
		int id;
	~student(){
		cout<<"child destructor"<<endl;
	}
	void getinfo(){
		cout<<"Name : "<<name<<endl;
		cout<<"Age : "<<age<<endl;
		cout<<"ID : "<<id<<endl;
	}
	student(string name,int age,int id){
		this->name = name;
		this->age = age;
		this->id = id;
	}
};
int main(){
	student s1("Piyush",18,494);
	student s2(s1);
	s2.getinfo();
}
