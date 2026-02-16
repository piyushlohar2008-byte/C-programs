#include<iostream>
using namespace std;
class Base{
	public:
		int a;
		Base(int x)
		{
			a = x;
			cout<<"Base constructor called "<<a<<endl;
		}
};
class Derived:public Base{
	public:
		int b;
		Derived(int a,int y):Base(a)
		{
			b = y;
			cout<<"Derived constructor called "<<b<<endl;
		}
};
int main()
{
	Derived obj(10,20);
}
