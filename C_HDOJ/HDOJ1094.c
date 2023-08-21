#include <stdio.h>

int main(){
	int n,number,sum;
	while(~scanf("%d",&n)){
		sum = 0;
		while(n--){
			scanf("%d",&number);
			sum += number;
		}
		printf("%d\n",sum);	
	}
	return 0;
}