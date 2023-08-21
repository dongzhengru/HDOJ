#include <stdio.h>

int main(){
	int i,n;
	
	while(~scanf("%d",&n)&&n!=0){
		int floor[100];
		int now=0,time=0;
		for(i=0;i<n;i++){
			scanf("%d",&floor[i]);
			if(now<=floor[i]){
				time+=6*(floor[i]-now);
				time+=5;
				now=floor[i];
			}
			else{
				time+=4*(now-floor[i]);
				time+=5;
				now=floor[i];
			}
		}
		printf("%d\n",time);
	}
	return 0;
}