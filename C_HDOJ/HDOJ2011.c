#include <stdio.h>

int main(){
	int i,j,m,n;
	float sum;
	scanf("%d",&m);
	while(m--){
		sum=0;
		scanf("%d",&n);
		for(j=1;j<=n;j++){
			if(j%2==0.0){
				sum-=1.0/j;
			}
			else{
				sum+=1.0/j;
			}
		}
		printf("%.2f\n",sum);
	}
		return 0;
}
