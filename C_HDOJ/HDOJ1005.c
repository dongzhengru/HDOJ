#include <stdio.h>

int main(){
	int i,a,b,n;
	int f[49];
	f[0]=1;
	f[1]=1;
	while(~scanf("%d %d %d",&a,&b,&n)&&(a!=0||b!=0||n!=0)){
		for(i=2;i<49;i++){
			f[i]=(a*f[i-1]+b*f[i-2])%7;
		}
		printf("%d\n",f[(n-1)%49]);
	}
	return 0;
}