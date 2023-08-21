#include <stdio.h>

int main(){
	int i,n,sum1,sum2,sum3;
	float number;
	while(~scanf("%d",&n)&&n!=0){
		i=n;
		sum1=0;
		sum2=0;
		sum3=0;
		for(i=0;i<n;i++){
			scanf("%f",&number);
			if(number>0){
				sum3++;
			}
			else if(number<0){
				sum1++;
			}
			else{
				sum2++;
			}
		}
		printf("%d %d %d\n",sum1,sum2,sum3);
	}
	return 0;
}