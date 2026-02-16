#include<iostream>
#include<iomanip>
using namespace std;
int main()
{
	float pi = 3.1457892;
	int num = 5;
	cout<<setw(10)<<num<<endl;
	cout<<fixed<<setprecision(4)<<pi<<endl;
	cout<<scientific<<pi<<endl;
	cout<<left<<num;
}
