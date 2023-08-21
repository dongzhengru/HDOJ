#include <stdio.h>

int main(){
	int n,m,i,num[100],m_sum,sum;
	while(~scanf("%d %d",&n,&m)){
		sum=0;
		m_sum=0;
		for(i=0;i<n;i++){
			num[i]=2*i+2;
			sum+=num[i];
			m_sum++;
			if(m_sum%m==0){
				printf(m_sum==n?"%d\n":"%d ",sum/m);
				sum=0;
			}
		}
		if(m_sum%m!=0){
			printf("%d\n",sum/(m_sum%m));
		}
	}
	return 0;
}