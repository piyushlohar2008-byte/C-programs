#include<iostream>
using namespace std;
class counter{
	private:
		static int count;
		public:
			counter()
			{
				count++;
			}
			static void compute()
			{
				cout<<count<<" object created";
			}
};
int counter::count = 0;
int main()
{
	counter obj1;
	counter obj2;
	counter obj3;
	counter::compute();
}
