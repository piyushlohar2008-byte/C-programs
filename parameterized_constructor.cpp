#include<iostream>
using namespace std;
class student{
	private:
		string name;
		int rollno;
		public:
			student(string n,int rn)
			{
				name = n;
				rollno = rn;
			}
			void display()
			{
				cout<<"Name : "<<name<<endl;
				cout<<"Rollno : "<<rollno<<endl;
			}
};
int main()
{
	student obj("Piyush",33);
	obj.display();
}
