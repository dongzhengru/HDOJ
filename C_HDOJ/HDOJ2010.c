#include <stdio.h>

int main(){
	int m,n,a,b,c,num;
	
	while(~scanf("%d %d",&m,&n)){
		num=0;
		a=m/100;
		b=m/10-10*a;
		c=m%10;
		for(;m<=n;m++){
			a=m/100;
			b=m/10-10*a;
			c=m%10;
			if(m == a*a*a+b*b*b+c*c*c){
				printf(num > 0 ? " %d":"%d",m);
				num++;
			}
		}
		if(num == 0){
			printf("no");
		}
		printf("\n");
	}
	return 0;
}