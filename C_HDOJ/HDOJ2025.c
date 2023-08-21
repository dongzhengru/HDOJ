#include <stdio.h>
#include <string.h>

int main(){
	int i,len;
	char s[100];
	char max[1];
	while(~scanf("%s",s)){
		len=strlen(s);
		max[0]=s[0];
		for(i=0;i<len;i++){
			if(s[i]>max[0]){
				max[0]=s[i];
			}
		}
		for(i=0;i<len;i++){
			printf("%c",s[i]);
			if(s[i]==max[0]){
				printf("(max)");
			}
		}
		printf("\n");
	}
	return 0;
}