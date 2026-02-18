#include<iostream>
#include<iomanip>
using namespace std;
int main(){
	int i,j,n;
	cout<<"Enter number : ";
	cin>>n;
	for(i=1;i<=n;i++){
		cout<<setw(5);
		for(j=1;j<=n-i+1;j++){
			cout<<"* ";
		}
		cout<<setw(5);
		cout<<endl;

	}
	for(i=2;i<=n;i++){
		for(j=1;j<=i;j++){
			cout<<"* ";
		}
		cout<<endl;
			cout<<setw(5);
	}
	for(i=1;i<=n;i++){
		cout<<"* "<<endl;
			cout<<setw(5);
	}
}
