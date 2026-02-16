#include<iostream>
using namespace std;
class measure{
	private:
		int add1,add2,add3;
		public:
			measure(int a1,int a2)
			{
				add1 = a1;
				add2 = a2;
			}
			void display()
			{
				add3 = add1 + add2;
				cout<<"Addition : "<<add3;
			}
};
int main()
{
	measure obj(25,35);
	obj.display();
}
