#include<iostream>
using namespace std;
class base{
	public:
		virtual void input()
		{
			cout<<"Welcome to virtual function"<<endl;
		}
};
class derived:public base{
	public:
		void input()
		{
			cout<<"Welcome to derived class"<<endl;
		}
};
int main()
{
	derived obj;
	derived *ptr;
	ptr = &obj;
	base obj2;
	base *p;
	p = &obj2;
	ptr->input();
	p->input();
	
}
