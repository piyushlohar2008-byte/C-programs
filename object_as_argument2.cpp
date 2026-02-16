#include<iostream>
using namespace std;
class demo{
			int x,y;
	public:
		void get(int a,int b)
		{
			x = a;
			y = b;	
		}
		void show(demo obj2)
		{
			int result = x + y;
			cout<<"Result : "<<result;
		}
};
int main()
{
	demo obj,obj2;
	obj.get(10,10);
	obj.show(obj2);
}
