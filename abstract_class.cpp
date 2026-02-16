#include<iostream>
using namespace std;
class calculate{
	public:
		virtual void input()=0;
};
class addition : public calculate{
	public:
		int num1,num2,sum;
		void input()
		{
			cout<<"Enter numbers : ";
			cin>>num1>>num2;
		}
		void showdata()
		{
			sum = num1 + num2;
			cout<<"Addition : "<<sum<<endl;
		}
};
class substraction : public calculate{
	public:
		int no1,no2,sub;
		void input()
		{
			cout<<"Enter numbers : ";
			cin>>no1>>no2;
		}
		void display()
		{
			sub = no1 - no2;
			cout<<"Substraction : "<<sub<<endl;
		}
};
int main()
{
	addition obj;
	substraction obj2;
	obj.input();
	obj2.input();
	obj.showdata();
	obj2.display();
}
