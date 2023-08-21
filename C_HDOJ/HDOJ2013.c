#include <stdio.h>

int main(){
	int n,i,peach;
	while(~scanf("%d",&n)){
		peach=1;
		for(i=n-1;i>0;i--){
			peach=peach*2+2;
		}
		printf("%d\n",peach);
	}
	return 0;
}