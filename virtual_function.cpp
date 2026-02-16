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
	obj.input();
	base obj2;
	obj2.input();	
}
