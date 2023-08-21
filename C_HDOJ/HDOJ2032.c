#include <stdio.h>

int main(){
	int i,j,n;
	int num[100][100];
	for(i=0;i<30;i++){
  		num[i][0]=1;
  		num[i][i]=1;
		for(j=1;j<=i-1;j++){
			num[i][j]=num[i-1][j] + num[i-1][j-1];
		}
  	}
 
	while(~scanf("%d",&n)){
		for(i=0;i<n;i++){
   			for(j=0;j<=i;j++){
   				printf(i==j?"%d\n":"%d ",num[i][j]);
   			}  
  		}
		printf("\n");
	}
	return 0;
}