#include<iostream>
using namespace std;
class demo{
	public:
	void display();
	demo(){
		cout<<"Welcome to Constructor"<<endl;
	}
};
void demo::display(){
  cout<<"Welcome to SGI";
}
int main(){
	demo obj;
	obj.display();
}

