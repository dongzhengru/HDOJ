#include <stdio.h>

int main(){
	int n,number,sum;
	while(~scanf("%d",&n)){
		sum = 1;
		while(n--){
			scanf("%d",&number);
			if(number % 2 != 0){
			sum *= number;
			}
		}
		printf("%d\n",sum);
	}
	return 0;
}