#include <stdio.h>
__int64 f[55];
int main(){
	int i,n,temp;
	f[0]=1;
	f[1]=1;
	for(i=2;i<=54;i++){
		f[i]=f[i-1]+f[i-2];
	}
	while(~scanf("%d",&n)){
		printf("%I64d\n",f[n]);
	}
	return 0;
}