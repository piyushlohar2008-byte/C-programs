#include<iostream>
using namespace std;
class demo{
	public:
		string name;
		int ID;
		void getdata()
		{
			cout<<"Enter name : ";
			cin>>name;
			cout<<"Enter ID : ";
			cin>>ID;
		}
		void showdata()
		{
			cout<<"Name : "<<name<<endl;
			cout<<"ID : "<<ID<<endl;
		}
};
int main()
{
	demo obj;
	demo *ptr;
	ptr = &obj;
	ptr->getdata();
	ptr->showdata();
}
