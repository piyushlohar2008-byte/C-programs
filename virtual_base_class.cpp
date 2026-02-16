#include<iostream>
using namespace std;
class shape{
	public:
		void shapedata()
		{
			cout<<"I am shape"<<endl;
		}
};
class rectangle : virtual public shape{
	public:
		int length,width;
		void get(int lth,int wd)
		{
			length = lth;
			width = wd;
		}
		void show()
		{
			cout<<"Area of rectangle : "<<length*width<<endl;
		}
};
class circle : virtual public shape{
	public:
		float rad;
		void getdata(float r)
		{
			rad = r;
		}
		void showdata()
		{
			cout<<"Area of circle : "<<3.14*rad*rad<<endl;
		}
};
class square : public rectangle,public circle{
	public:
		void call()
		{
			shapedata();
		}
};
int main()
{
	square obj;
	obj.shapedata();
	obj.get(10,5);
	obj.getdata(2.5);
	obj.show();
	obj.showdata();
}

