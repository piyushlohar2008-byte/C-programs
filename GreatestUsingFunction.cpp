#include<iostream>
using namespace std;
   void greatest(int num1,int num2){
   	if(num1>num2){
   		cout<<"The greater is num1"<<endl;
	   }
	   else{
	   	cout<<"The greater is num2"<<endl;
	   }
   }
  int main(){
    int num1,num2;
    cout<<"Enter value of num1 and num2 : ";
    cin>>num1>>num2;
    greatest(num1,num2);
}
