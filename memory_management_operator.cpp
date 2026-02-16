#include<iostream>
using namespace std;
int main()
{
	int *ptr = new int;
	*ptr = 10;
	cout<<*ptr;
	delete ptr;
	int *arr = new int[5];
	for(int i=0;i<5;i++)
	{
		cin>>arr[i];
	}
	for(int i=0;i<5;i++)
	{
		cout<<arr[i];
	}
	delete[] arr;
}
