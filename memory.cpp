#include<iostream>
using namespace std;
class shape
{
	public:
	virtual void area()=0;	
};
class circle:public shape
{
	public:
		float rad = 2;
		void area()
		{
			cout<<"Area of circle : "<<3.14*rad*rad<<endl;
		}
};
class square:public shape
{
	public:
		int side = 23;
		void area()
		{
			cout<<"Area of square : "<<side*side<<endl;	
		}	
};
int main()
{
	circle obj1;
	square obj2;
	obj1.area();
	obj2.area();
}

