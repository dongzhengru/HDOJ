#include <stdio.h>

int main(){
	int i,n,m,number[100],temp;
	while(~scanf("%d %d",&n,&m)&&(n!=0 || m!=0)){
		for(i=0;i<n;i++){
			scanf("%d",&number[i]);		
		}
		number[n]=m;
		for(i=n;i>0;i--){
			if(number[i]<number[i-1]){
			temp=number[i];
			number[i]=number[i-1];
			number[i-1]=temp;
			}
		}
		for(i=0;i<n;i++){
			printf("%d ",number[i]);
		}
		printf("%d\n",number[n]);
	}
	return 0;
}