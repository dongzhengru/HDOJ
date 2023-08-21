#include <stdio.h>

int main(){
	int i,n;
	
	scanf("%d",&n);
	while(n--){
		int s[9];
		for(i=0;i<6;i++){
			scanf("%d",&s[i]);
		}
		s[8]=s[2]+s[5];
		s[7]=s[1]+s[4];
		s[6]=s[0]+s[3];
		if(s[8]>59){
			s[8]-=60;
			s[7]++;
		}
		if(s[7]>59){
			s[7]-=60;
			s[6]++;
		}
		if(s[6]>59){
			s[6]-=60;
			s[5]++;
		}
		printf("%d %d %d\n",s[6],s[7],s[8]);
	}
	return 0;
}