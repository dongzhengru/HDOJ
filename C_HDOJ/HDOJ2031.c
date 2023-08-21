#include <stdio.h>

int main(){
	int i,n,r,f;
	int num[50];
	while(~scanf("%d %d",&n,&r)){
		i=0;
		f=1;
		if(n<0){
			n=-n;
			f=0;
		}
		while(n){
			num[i]=n%r;
			n=n/r;
			i++;
		}
		if(f==0){
			printf("-");
		}
		for(i-=1;i>=0;i--){
			if(num[i]<10){
				printf("%d",num[i]);
			}
			else{
				switch(num[i]){
					case 10:printf("A");break;
					case 11:printf("B");break;
					case 12:printf("C");break;
					case 13:printf("D");break;
					case 14:printf("E");break;
					case 15:printf("F");break;
				}
			}
		}
		printf("\n");
	}
	return 0;
}