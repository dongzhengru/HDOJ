#include <stdio.h>

int main(){
	int i,j,x,y,t,sum1,sum2;	//sum1:2,4,6...;sum2:1,3,5...
	while(~scanf("%d %d",&x,&y)){
		sum1=0;
		sum2=0;
		if(x>y){
			t=x;
			x=y;
			y=t;
		}
		if(x % 2 == 0){
			for(i=x;i<=y;i+=2){
				sum1+=i*i;
			}
			for(j=x+1;j<=y;j+=2){
				sum2+=j*j*j;
			}
		}
		else{
			for(i=x+1;i<=y;i+=2){
				sum1+=i*i;
			}
			for(j=x;j<=y;j+=2){
				sum2+=j*j*j;
			}
		}
		printf("%d %d\n",sum1,sum2);
	}
	return 0;
}