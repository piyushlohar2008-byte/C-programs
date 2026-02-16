#include<iostream>
using namespace std;
class demo{
	private:
		int roll;
		int id;
		public:
			void get(int r,int i)
			{
				roll = r;
				id = i;
			}
			void set()
			{
				cout<<"Roll : "<<roll<<endl;
				cout<<"Id : "<<id<<endl;
			}
};
int main()
{
	demo obj;
	obj.get(33,17);
	obj.set();
}
