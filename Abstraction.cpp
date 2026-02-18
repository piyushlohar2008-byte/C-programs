#include<iostream>
using namespace std;
class student{
	virtual void draw(){
	}
};
class circle{
	public:
	virtual void draw(){
		cout<<"Draw Rectangle";
	}
};
int main(){
	circle c1;
	c1.draw();
}
