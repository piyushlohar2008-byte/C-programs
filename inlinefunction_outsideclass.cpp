#include<iostream>
using namespace std;
class demo{
	private:
		int num1,num2;
	public:
		demo(int n1,int n2)
		{
			num1 = n1;
			num2 = n2;
		}
		void compute();
		void display();
};
inline void demo::compute()
{
	num1 += num2;
}
inline void demo::display()
{
	
	cout<<"num1 : "<<num1<<endl;
	cout<<"num2 : "<<num2<<endl;
}
int main()
{
	demo obj(10,3);
	obj.compute();
	obj.display();
}
