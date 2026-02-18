#include<iostream>
using namespace std;
class teacher{
	private:
		double salary;
	public:
		teacher(){//Non-parameterized
			cout<<"Hi,I am Constructor"<<endl;
		}
        teacher(string name,string subject,string dept){//paramaterized    
        	this->name = name;
        	this->subject = subject;
        	this->dept = dept;
		}
		teacher(teacher &orgob){//Coustom Constructor
			cout<<"I am Coustom Copy"<<endl;
			this->name = orgob.name;
			this->subject = orgob.subject;
			this->dept = orgob.dept;
		}
		string name;
		string subject;
		string dept;
		void getinfo(){
			cout<<"name : "<<name<<endl;
			cout<<"Subject : "<<subject<<endl;
			cout<<"Dept : "<<dept<<endl;
		}
		void setsalary(double s){
			salary = s;
		}
		double getsalary(){
			return salary;
		}
};
int main(){
	teacher t1("Piyush","C++","CSE");
	teacher t3;
//	t1.getinfo();
	teacher t2(t1);//Coustom constructor
	t2.getinfo();
	t1.setsalary(25000);
	cout<<t1.getsalary();
	return 0;
}
