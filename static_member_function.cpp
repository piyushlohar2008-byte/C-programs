#include<iostream>
using namespace std;
class book{
	private:
		int no;
		static int count;
		public:
			book(int n)
			{
				no = n;
				cout<<no<<endl;
			}
			static void show()
			{
				count++;
				cout<<"Count : "<<count<<endl;
			}
};
int book::count = 4;
int main()
{
	book b(45);
	b.show();
}
