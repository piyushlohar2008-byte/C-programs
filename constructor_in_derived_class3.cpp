#include<iostream>
using namespace std;
class Base{
	public:
		int x;
		Base(int a)
		{
			x = a;
			cout<<"Base constructor"<<endl;
		}
};
class Derived:public Base{
	public:
		Derived():Base(10)
		{
			cout<<"Derived constructor "<<x<<endl;
		}
};
int main()
{
	Derived obj;
}
