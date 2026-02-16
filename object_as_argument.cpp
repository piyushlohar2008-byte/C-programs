#include<iostream>
using namespace std;
class teacher{
	private:
		int num1,num2;
		public:
			void input(int n1,int n2)
			{
				num1 = n1;
				num2 = n2;
			}
			void display(teacher obj)
			{
				int sum = obj.num1 + obj.num2;
				cout<<"Sum : "<<sum<<endl;
			}
};
int main()
{
	teacher obj;
	obj.input(10,10);
	teacher obj2;
	obj2.display(obj);
}
