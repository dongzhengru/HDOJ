#include <stdio.h>

int main(){
	 int n,number,sum=0;
	 while(scanf("%d",&n),n){
		 while(n--){
		 	scanf("%d",&number);
		 	sum += number;
		 }
		 printf("%d\n",sum);
		 sum = 0;
	 }
	 
	 return 0;
}