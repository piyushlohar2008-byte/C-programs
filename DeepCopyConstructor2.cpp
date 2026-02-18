#include<iostream>
using namespace std;
class student{
	public:
		string name;
		double *idptr;
	student(string name,double id){
		this->name = name;
		idptr = new double(id);
	}
	student(student &ob){
		this->name = ob.name;
		this->idptr = ob.idptr;
	}
	void getinfo(){
		cout<<"Name : "<<name<<endl;
		cout<<"Id : "<<*idptr<<endl;
	}
	
};
int main(){
	student s1("Piyush",8.9);
	student s2(s1);
	s2.getinfo();
	s2.name = "Aditya";
	*(s2.idptr) = 9.5;
	s2.getinfo();
}
