#include <stdio.h>

int main(){
	int i,n;
	__int64 f[25];
	f[1]=0;
	f[2]=1;
	while(~scanf("%d",&n)){
		for(i=3;i<=n;i++){
			f[i]=(i-1)*(f[i-1]+f[i-2]);
		}
		printf("%I64d\n",f[n]);
	}
	return 0;
}