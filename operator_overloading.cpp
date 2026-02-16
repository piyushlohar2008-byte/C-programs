#include<iostream>
using namespace std;
class sample{
	public:
		int x;
		void get(int a)
		{
			x = a;
		}
		void operator -()
		{
			x = -x;
		}
		void show()
		{
			cout<<"X : "<<x;
		}
};
int main()
{
	sample obj;
	obj.get(10);
	-obj;
	obj.show();
}

