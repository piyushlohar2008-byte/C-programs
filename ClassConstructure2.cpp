#include<iostream>
using namespace std;
class teacher{
	private:
		double salary;
		double balance;
	public:
//		teacher(){
//			cout<<"Hi,I am Constructor"<<endl;
//		}
        teacher(string n,string s,string d){//paramaterized
        	name = n;
        	sub = s;
        	dept = d;
		}
		string name;
		string sub;
		string dept;
		void getinfo(){
			cout<<"name : "<<name<<endl;
			cout<<"Subject : "<<sub<<endl;
			cout<<"Dept : "<<dept<<endl;
		}
};
int main(){
	teacher t1("Piyush","C++","CSE");
	t1.getinfo();
	return 0;
}
