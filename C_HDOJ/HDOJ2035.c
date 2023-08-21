#include <stdio.h>

int main(){
	int i,a,b;
	while(~scanf("%d %d",&a,&b)&&(a||b)){
		int sum=1;
		int result;
		for(i=0;i<b;i++){
			sum*=a;
			if(sum>=10000){
				sum=sum%10000;
			}
		}
		result=sum%1000;
		printf("%d\n",result);
	}
	return 0;
}