#include<iostream>
#include<iomanip>
using namespace std;
int main(){
	int x=10;
	int *ptr;
	ptr = &x;
	cout<<setfill('*')<<setw(10)<<*ptr;
}
