#include <stdio.h>

int main(){
	int i,j,n,m,f,ac_sum;
	double sum,score[51][6];
	double average_score1[51],average_score2[6];
	while(~scanf("%d %d",&n,&m)){
		for(i=1;i<=n;i++){
			for(j=1;j<=m;j++){
				scanf("%lf",&score[i][j]);
			}
		}
		for(i=1;i<=n;i++){
			sum=0;
			for(j=1;j<=m;j++){
				sum+=score[i][j];
			}
			average_score1[i]=sum/m;
			printf(i==1?"%.2lf":" %.2lf",average_score1[i]);
		}
			printf("\n");
		for(j=1;j<=m;j++){
			sum=0;
			for(i=1;i<=n;i++){
				sum+=score[i][j];
			}
			average_score2[j]=sum/n;
			printf(j==1?"%.2lf":" %.2lf",average_score2[j]);
		}
			printf("\n");
		ac_sum=0;
		for(i=1;i<=n;i++){
			f=1;
			for(j=1;j<=m;j++){
				if(score[i][j]<average_score2[j]){
					f=0;
					break;
				}
			}
			if(f==1){
				ac_sum+=1;
			}
		}
		printf("%d\n\n",ac_sum);
	}
	return 0;
}