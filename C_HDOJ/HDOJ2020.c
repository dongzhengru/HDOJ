#include <stdio.h>
#include <math.h>

int main(){
	int i,j,n,temp;
	int num[101]={0};
	while(~scanf("%d",&n)&&n!=0){
		for(i=0;i<n;i++){
			scanf("%d",&num[i]);
		}
		for(i=1;i<n;i++){
			for(j=0;j<n-i;j++){
				if(fabs(num[j])<fabs(num[j+1])){
					temp=num[j];
					num[j]=num[j+1];
					num[j+1]=temp;
				}
			}
		}
		for(i=0;i<n-1;i++){
			printf("%d ",num[i]);
		}
		printf("%d\n",num[i]);
	}
	return 0;
}