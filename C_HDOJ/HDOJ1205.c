#include <stdio.h>

int main(){
	int t;
	__int64 i,sum;
	scanf("%d",&t);
	while(t--){
		__int64 n,temp,max;
		sum=0;
		max=-1;
		scanf("%I64d",&n);
		for(i=0;i<n;i++){
			scanf("%I64d",&temp);
			if(temp>=max){
				max=temp;
			}
			sum+=temp;
		}
		if((max-(sum-max))<=1){
			printf("Yes\n");
		}
		else{
			printf("No\n");
		}
	}
	return 0;
}