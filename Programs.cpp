#include<iostream>
using namespace std;
class teacher{
	private:
		double salary;
	public:
		teacher(){
			cout<<"Hi,i am constructor";
		}
		teacher(string name,string subject,string dept){
			this->name = name;
			this->subject = subject;
			this->dept = dept;
		}
	void getinfo(){
		cout<<"name : "<<name<<endl;
		cout<<"subject : "<<subject<<endl;
		cout<<"dept : "<<dept<<endl;
	}
	teacher(teacher &orgob){
		cout<<"Welcome to copy coustom constructor"<<endl;
		this->name = orgob.name;
		this->subject = orgob.subject;
		this->dept = orgob.dept;
	}
	void setsalary(double s){
		salary = s;
	}
	double getsalary(){
		cout<<"Salary : ";
		return salary;
	}
	string name;
	string subject;
	string dept;
};
int main(){
	teacher t1("Piyush","C++","Computer Science");
//	t1.getinfo();
    teacher t2(t1);
    t2.getinfo();
    t1.setsalary(25000);
    cout<<t1.getsalary();
	return 0;
}
