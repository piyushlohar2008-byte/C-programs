#include<iostream>
using namespace std;
class teacher{
	private:
		double salary;//declare variable salary
	public:
		//Setter
		void setsalary(double s){
			salary = s;//assign salary to variable s
		}
		//getter
		double getsalary(){
			return salary;//return salary to function
		}
};
int main(){
	teacher t1,t2,t3;
	t1.setsalary(25000);
	t2.setsalary(50000);
	t3.setsalary(75000);
	cout<<t1.getsalary()<<endl;
	cout<<t2.getsalary()<<endl;
	cout<<t3.getsalary()<<endl;
		return 0;
}
