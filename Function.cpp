#include<iostream>
using namespace std;
   void change(int a,int b){
   	int *ptr;
   	*ptr=a;
   	a=b;
   	b=*ptr;
   	cout<<"After changing the value : "<<a<<" "<<b<<endl;
   }
  int main(){
	int a,b;
	cout<<"Enter value of a and b : ";
	cin>>a>>b;
	cout<<"Before changing the value : "<<a<<" "<<b<<endl;
	change(a,b);
}
