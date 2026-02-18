#include<iostream>
using namespace std;
class teacher{
	private:
		double salary;
		double balance;
	public:
		teacher(){
			cout<<"Hi,I am Constructor"<<endl;
		}
        teacher(string name,string subject,string dept){//paramaterized
        	this->name = name;
        	this->subject = subject;
        	this->dept = dept;
		}
		string name;
		string subject;
		string dept;
		void getinfo(){
			cout<<"name : "<<name<<endl;
			cout<<"Subject : "<<subject<<endl;
			cout<<"Dept : "<<dept<<endl;
		}
};
int main(){
	teacher t1("Piyush","C++","CSE");
	t1.getinfo();
	return 0;
}
