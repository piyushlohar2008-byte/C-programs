#include<iostream>
using namespace std;
class calculate{
	public:
		virtual void area()=0;
};
class square:public calculate{
	public:
		int s;
		void get()
		{
			cout<<"Enter side : ";
			cin>>s;
		}
		void area()
		{
			cout<<"Area : "<<s*s<<endl;
		}
}; 
class rectangle :public calculate{
	public:
		int l,wd;
		void let()
		{
			cout<<"Enter values : ";
			cin>>l>>wd;
		}
		void area()
		{
			cout<<"Area : "<<l*wd<<endl;
		}
};
int main()
{
	square s;
	rectangle r;
	s.get();
	r.let();
	s.area();
	r.area();
}
