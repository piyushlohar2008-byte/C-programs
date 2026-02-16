#include<iostream>
using namespace std;
class home{
	private:
		int no1,no2;
		public:
			home(int n1,int n2)
			{
				no1 = n1;
				no2 = n2;
			}
			friend void read(home &ref);
};
void read(home &ref)
{
	int result = ref.no1 + ref.no2;
	cout<<"Result : "<<result<<endl;
}
int main()
{
	home obj(20,10);
	read(obj);
}
