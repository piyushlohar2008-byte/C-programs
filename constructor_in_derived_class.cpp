#include<iostream>
using namespace std;
class Base{
	public:
		int a;
		Base(int x)
		{
			a = x;
			cout<<"Base constructor : "<<a<<endl;
		}
};
class Derived : public Base{
	public:
		int b;
		Derived(int a,int y):Base(a)
		{
			b = y;
			cout<<"Derived constructor : "<<b<<endl;
		}
};
int main()
{
	Derived obj(10,20);
}
