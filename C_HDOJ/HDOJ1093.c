#include <stdio.h>

int main(){
	int line,n,number,sum;
	scanf("%d",&line);
	while(line--){
		sum=0;
		scanf("%d",&n);
		while(n--){
			scanf("%d",&number);
			sum += number;
		}
		printf("%d\n",sum);
	}
	return 0;
}