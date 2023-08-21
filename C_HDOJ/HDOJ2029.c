#include <stdio.h>
#include <string.h>

int main(){
	int i,n;
	scanf("%d",&n);
	char s[150];
	getchar();
	while(n--){
		gets(s);
		int len;
		len=strlen(s);
		for(i=0;i<len/2+1;i++){
			if(s[i]!=s[len-i-1]){
				printf("no\n");
				break;
			}
		}
		if(i==len/2+1){
			printf("yes\n");
		}
	}
	return 0;
}