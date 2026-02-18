#include<iostream>
using namespace std;
class teacher{
	private:  //Access modifired 
		double salary;
		double balance;
	public:  //Access modifired
		teacher(){  //Simple constructor
			cout<<"Hi,I am Constructor"<<endl;
		}
        teacher(string name,string subject,string dept,int rollno){//paramaterized
        	this->name = name;  //Give original properties to the name,sub,dept,rollno
        	this->subject = subject;
        	this->dept = dept;
        	this->rollno = rollno;
		}
		teacher(teacher &orgob){  //Copy Coustom Constructor
			cout<<"Copy Coustom Constructor"<<endl;
			this->name = orgob.name;
			this->subject = orgob.subject;
			this->dept = orgob.dept;
			this->rollno = orgob.rollno;
		}
		void getinfo(){   //Function calling to the main function   
			cout<<"name : "<<name<<endl;  //print output name
			cout<<"Subject : "<<subject<<endl;  //print output subject
			cout<<"Dept : "<<dept<<endl;  //print output dept
			cout<<"Roll No : "<<rollno<<endl;  //print output rollno
		}
		string name;  //declare name as a string datatype
		string subject;  //declare subject as a string datatype
		string dept;   //declare dept as a string datatype
		int rollno;  //declare rollno as a integer datatype
};
int main(){
	teacher t1("Piyush","C++","CSE",33);  //Assign the all information  
//	t1.getinfo();
	teacher t2(t1);//Copy constructor
	t2.getinfo();  //Function call to the getinfo for print the output 
	return 0;
}





