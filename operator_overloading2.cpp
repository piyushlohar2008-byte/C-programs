#include<iostream>
using namespace std;
class dimple{
	public:
		int x;
		void get(int a)
		{
			x = a;
		}
		void operator -()
		{
			if(x < 0)
			{
				x = +x;
			}
		}
		void show()
		{
			cout<<"X : "<<-x;
		}
};
int main()
{
	dimple obj;
	obj.get(-10);
	-obj;
	obj.show();
}

