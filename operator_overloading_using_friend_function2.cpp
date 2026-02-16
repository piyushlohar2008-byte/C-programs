#include<iostream>
using namespace std;
class overload{
	public:
		int x;
		void get(int a)
		{
			x = a;
		}
		void show()
		{
			cout<<"X : "<<x;
		}
		friend void operator -(overload &ref);
};
void operator -(overload &ref)
		{
			ref.x = -ref.x;
		}
int main()
{
	overload obj;
	obj.get(10);
	-obj;
	obj.show();
}

