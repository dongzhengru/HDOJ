#include <stdio.h>

int main(){
	int i,n,temp;
	__int64 f[10010]={0};
	f[1]=2;
	scanf("%d",&n);
	while(n--){
		scanf("%d",&temp);
		for(i=2;i<=temp;i++){
			f[i]=f[i-1]+4*(i-1)+1;
		}
		printf("%I64d\n",f[temp]);
	}
	return 0;
}