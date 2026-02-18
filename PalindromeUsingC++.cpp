#include<iostream>
using namespace std;
int main(){
	int n,origin=0,digit,temp;
	cout<<"Enter numbers : ";
	cin>>n;
	temp=n;
	while(n!=0){
		digit=n%10;
		origin=(10*origin)+digit;
		n/=10;
	}
	if(temp==origin){
		cout<<"PalindRome";
	}
	else{
		cout<<"Not PalindRome";
	}
}
