#include <stdio.h>

int main(){
	int i,n,sum[56];
	while(~scanf("%d",&n)&&n!=0){
		sum[1]=1;
		sum[2]=2;
		sum[3]=3;
		for(i=4;i<=n;i++){
			sum[i]=sum[i-1]+sum[i-3];
		}
		printf("%d\n",sum[n]);	
	}
	return 0;
}