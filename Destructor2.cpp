#include<iostream>
using namespace std;
class student{
	public:
		string name;
		int id;
	student(string name,int id){
		this->name = name;
		this->id = id;
	}
	void getinfo(){
		cout<<"Name : "<<name<<endl;
		cout<<"Id : "<<id<<endl;
	}
	~student(){
		cout<<"Hi i am destructor:";
	}
};
int main(){
	student s1("Piyush",33);
	s1.getinfo();
}
