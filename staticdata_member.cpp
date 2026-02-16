#include<iostream>
using namespace std;
class origin{
	private:
		int num;
		static int count;
		public:
			origin(int n)
			{
				num = n;
			}
			void display()
			{
				cout<<"Number : "<<num<<endl;
				cout<<"Count : "<<count<<endl;
			}
};
int origin::count = 10;
int main()
{
	origin obj(5);
	obj.display();
}
