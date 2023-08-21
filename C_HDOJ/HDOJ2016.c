#include <stdio.h>

int main(){
	int i,n,min,i_min,temp,number[100];
	while(~scanf("%d",&n) && n!=0){
		min=1e8;
		i_min=100;
		for(i=0;i<n;i++){
			scanf("%d",&number[i]);
			if(number[i]<min){
				min=number[i];
				i_min=i;
			}
		}
		temp=number[0];
		number[0]=min;
		number[i_min]=temp;
		printf("%d",number[0]);
		for(i=1;i<n;i++){
			printf(" %d",number[i]);
		}
		printf("\n");
	}
	return 0;
}