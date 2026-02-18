#include<iostream>
using namespace std;
int main(){
    int rows=4,cols=6;
    int i,j;
    for(i=1;i<=rows;i++){
    	for(j=1;j<=cols;j++){
    		if(i==1 || i==rows || j==1 || j==cols){
    			if(i==2 && j!=1 && j!=cols){
				 cout<<" ";
			}
				else {
				 cout<<"* ";
			}
				
			}
	       	}		
			   cout<<endl;
	       		}
}
	
	

