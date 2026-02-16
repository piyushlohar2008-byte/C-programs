#include<iostream>
using namespace std;
class natural{
	public:
		int num;
		void getinfo(int a)
		{
			num = a;
			for(int i=1;i<=num;i++)
			{
				cout<<i<<" ";
			}
			cout<<endl;
		}
};
class sum_of_digit : public natural{
	public:
		int sum = 0;
		void getdata()
		{
			for(int i=1;i<=5;i++)
			{
				sum+=i;
			}
		}
		void showdata()
		{
			cout<<"Sum of digit : "<<sum<<endl;
		}
};
class factorial : public natural{
	public:
		int fact = 1;
		void intput()
		{
			for(int i=1;i<=5;i++)
			{
				fact*=i;
			}
		}
		void output()
		{
			cout<<"Factorial : "<<fact<<endl;
		}
};
int main()
{
	sum_of_digit obj1;
	factorial obj2;
	obj1.getinfo(5);
	obj2.getinfo(10);
	obj1.getdata();
	obj1.showdata();
	obj2.intput();
	obj2.output();
}
