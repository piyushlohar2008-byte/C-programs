#include<iostream>
using namespace std;
int main()
{
	int arr[5]={10,20,30,40,50};
	int *ptr;
	ptr = arr;
	cout<<*ptr<<endl;
	ptr++;
	cout<<*ptr<<endl;
	ptr--;
	cout<<*ptr<<endl;
	ptr+=2;
	cout<<*ptr<<endl;
	ptr-=1;
	cout<<*ptr<<endl;
}
