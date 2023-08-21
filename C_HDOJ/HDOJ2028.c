#include <stdio.h>

int main(){
	int i,n;
	while(~scanf("%d",&n)){
		int num[100];
		int max=-1;
		for(i=0;i<n;i++){
			scanf("%d",&num[i]);
			if(num[i]>max){
				max=num[i];
			}
		}
		for(i=0;i<n;i++){
			if(max%num[i]!=0){
				i=-1;
				max++;
			}
		}
		printf("%d\n",max);
	}
	return 0;
}