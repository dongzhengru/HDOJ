#include <stdio.h>

int a[500005]={0};
int main(){
	int i,j,t,n;
	a[0]=a[1]=-1;
	scanf("%d",&t);
	for(i=2;i<500005;i++){
		for(j=i+i;j<500005;j+=i){
			a[j]+=i;
		}
	}
	while(t--){
		scanf("%d",&n);
		printf("%d\n",a[n]+1);
	}
	return 0;
}