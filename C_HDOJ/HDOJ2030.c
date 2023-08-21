#include <stdio.h>
#include <string.h>

int main(){
	int i,n;
	scanf("%d",&n);
	getchar();
	while(n--){
		char s[1000];
		int len,sum=0;
		gets(s);
		len=strlen(s);
		for(i=0;i<len;i++){
			if(s[i]<0){
				sum++;
			}
		}
		printf("%d\n",sum/2);
	}
	return 0;
}