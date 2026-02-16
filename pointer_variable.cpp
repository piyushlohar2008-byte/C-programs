#include<iostream>
using namespace std;
int main()
{
	int a = 40;
	int *ptr;
	ptr = &a;
	cout<<"address of a stored in ptr : "<<ptr<<endl;
	cout<<"Value stored at ptr : "<<*ptr;
}
