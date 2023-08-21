#include <stdio.h>
	
int main(){
	int n,i,sum,n100,n50,n10,n5,n2,n1;
	int wages[100];
		while(~scanf("%d",&n) && n!=0){
		sum=0;
		for(i=0;i<n;i++){
			scanf("%d",&wages[i]);
			n100=wages[i]/100;
			n50=(wages[i]-100*n100)/50;
			n10=(wages[i]-n100*100-n50*50)/10;
			n5=(wages[i]-n100*100-n50*50-n10*10)/5;
			n2=(wages[i]-n100*100-n50*50-n10*10-n5*5)/2;
			n1=wages[i]-n100*100-n50*50-n10*10-n5*5-n2*2;
			sum+=n100+n50+n10+n5+n2+n1;
		}
		printf("%d\n",sum);
	}
	return 0;
}
