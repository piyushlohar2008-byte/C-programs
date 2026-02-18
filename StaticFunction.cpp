#include<iostream>
using namespace std;
int main(){
	int digit,sum=0,n,temp;
	cout<<"Enter number : ";
	cin>>n;
	temp=n;
	while(n!=0){
		digit=n%10;
		sum=(10*sum)+digit;
		n/=10;
	}
	if(sum==temp){
		cout<<"Palindrome";
	}
	else{
		cout<<"Not Palindrome";
	}
}

