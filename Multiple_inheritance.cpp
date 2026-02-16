#include<iostream>
using namespace std;
class book{
	public:
		string book;
		int price;
		void getinfo()
		{
			cout<<"Enter bookname : ";
			cin>>book;
			cout<<"Enter price : ";
			cin>>price;
		}
		void show()
		{
			cout<<"Book name : "<<book<<endl;
			cout<<"Book price : "<<price<<endl;
		}
};
class computer{
	public:
		string name;
		string os;
		void getdata()
		{
			cout<<"Enter computer name : ";
			cin>>name;
			cout<<"Enter operating system : ";
			cin>>os;
		}
		void showdata()
		{
			cout<<"Computer name : "<<name<<endl;
			cout<<"Operating system : "<<os<<endl;
		}
};
class mobile : public book,public computer{
	public:
		string name;
		string storage;
		void letdata()
		{
			cout<<"Enter mobile name : ";
			cin>>name;
			cout<<"Enter storage : ";
			cin>>storage;
		}
		void display()
		{
			cout<<"Mobile name : "<<name<<endl;
			cout<<"Storage : "<<storage<<endl;
		}
};
int main()
{
	mobile obj;
	obj.getinfo();
	obj.getdata();
	obj.letdata();
	obj.show();
	obj.showdata();
	obj.display();
}
