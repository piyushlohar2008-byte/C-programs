#include<iostream>
using namespace std;
struct book{
	string name;
	string author;
	int cost;
};
int main()
{
	book b1[5];
	int i;
	for(i=0;i<5;i++)
	{
		cout<<"Enter book name : ";
		cin>>b1[i].name;
		cout<<"Enter book author : ";
		cin>>b1[i].author;
		cout<<"Enter book cost : ";
		cin>>b1[i].cost;
	}
	for(i=0;i<55;i++)
	{
		cout<<"Book name : "<<b1[i].name<<endl;
		cout<<"Book author : "<<b1[i].author<<endl;
		cout<<"Book cost : "<<b1[i].cost<<endl;
	}
}
