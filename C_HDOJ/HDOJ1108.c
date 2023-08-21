#include <stdio.h>

int main(){
	int a,b,max;
	while(~scanf("%d %d",&a,&b)){
		max=0;
		if(a>b){
			max=a;
		}
		else{
			max=b;
		}
		while(max!=0){
			if(max%a==0 && max%b==0){
				printf("%d\n",max);
				break;
			}
			else{
			max++;
			}
		}
	}
	return 0;
}