#include<iostream>
using namespace std;
class teacher{
	private:
		double salary;
	public:
		string name;
		double *idptr;
	teacher(string name,double id){
		this->name = name;
		idptr = new double(id);
	}
	teacher(teacher &ob){
		this->name = ob.name;
		this->idptr = ob.idptr;
		*idptr = *ob.idptr;
	}
	void getinfo(){
		cout<<endl<<"name : "<<name<<endl;
		cout<<"id : "<<*idptr<<endl;
	}
	void setsalary(double s){
		salary = s;
	}
	double getsalary(){
		cout<<"Salary : ";
		return salary;
	}
};
int main(){
	teacher t1("Piyush",9.5);
//	t1.getinfo();
    teacher t2(t1);
    t2.name = "Aditya";
    t1.getinfo();
    t1.setsalary(50000);
    cout<<t1.getsalary();
    *(t2.idptr) = 9.2;
//    t1.getinfo();
    t2.getinfo();
    t1.setsalary(25000);
    cout<<t1.getsalary();
   
}
