#include <stdio.h>
#include <math.h>

int main(){
	int i,j,m,n,max_i,max_j;;
	double temp,max;
	
	while(~scanf("%d %d",&m,&n)){
		max=max_i=max_j=0;
		for(i=1;i<=m;i++){
			for(j=1;j<=n;j++){
				scanf("%lf", &temp);
				if(fabs(temp)>fabs(max)){
					max=temp;
					max_i=i;
					max_j=j;
				}
			}
		}
		printf("%d %d %.0lf\n",max_i,max_j,max);
	}
	return 0;
}