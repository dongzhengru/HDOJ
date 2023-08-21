#include<stdio.h>
#include<math.h>

int main() {
	int x, y,flag,i,j,num,m;
	while(~scanf("%d %d", &x,&y) && (x||y)) {
		flag=1;
		for(i=x;i<=y;i++) {
			num=i*i+i+41; 
			m=(int)sqrt(num+0.5);
			for(j=2;j<=m;j++){
				if(num%j==0){
					flag = 0;
					break;
				}
				if(!flag){
					break;
				}
			}
			if(flag){
				printf("OK\n");
			}
			else{
				printf("Sorry\n");
			}
		}
	}
	return 0;
}