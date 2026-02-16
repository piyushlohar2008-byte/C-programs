#include<iostream>
using namespace std;
class sample{
	private:
		int num1,num2;
	public:
		inline void read(int n1,int n2)
		{
			num1 = n1;
			num2 = n2;
		}
		inline void display()
		{
			cout<<"Addition is : "<<num1+num2;
		}
};
int main()
{
	sample obj;
	obj.read(10,20);
	obj.display();
}
