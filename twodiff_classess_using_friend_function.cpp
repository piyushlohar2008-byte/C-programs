#include<iostream>
using namespace std;
class calculate2;
class calculate1{
	private:
		int m1;
		public:
			void input()
			{
				cout<<"Enter no : ";
				cin>>m1;
			}
			friend void average(calculate1 &ref1,calculate2 &ref2);
};
class calculate2{
	private:
		int m2;
		public:
			void input()
			{
				cout<<"Enter no : ";
				cin>>m2;
			}
			friend void average(calculate1 &ref1,calculate2 &ref2);
};
void average(calculate1 &ref1,calculate2 &ref2)
{
	int avg = ref1.m1 + ref2.m2;
	avg/=2;
	cout<<"Average marks : "<<avg<<endl;
}
int main()
{
	calculate1 obj1;
	calculate2 obj2;
	obj1.input();
	obj2.input();
	average(obj1,obj2);
}
