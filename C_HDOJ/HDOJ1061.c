#include <stdio.h>

int main(){
	int i,n,num,sum;
	scanf("%d",&n);
	int s[21]={0,1,4,7,6,5,6,3,6,9,0,1,6,3,6,5,6,7,4,9,0};
	while(n--){
		scanf("%d",&num);
		printf("%d\n",s[num%20]);	
	}
	return 0;
}