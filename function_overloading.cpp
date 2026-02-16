#include<iostream>
using namespace std;
class Maths{
	public:
		void input(int x)
		{
			cout<<"Square : "<<x*x<<endl;			
		}
		void input(float PI,int rad)
		{
			cout<<"Area of circle : "<<PI*rad*rad;
		}
};
int main()
{
	Maths obj;
	obj.input(12);
	obj.input(3.14f,2);
}
