#include <stdio.h>
#include <math.h>

int main(){
	int i,m;
	float n,t,result;
	while(~scanf("%f %d",&n,&m)){
		result=n;
		t=n;
		for(i=0;i<m-1;i++){
			n=sqrt(n);
			result+=n;
		}
		printf("%.2f\n",result);
	}
	return 0;
}