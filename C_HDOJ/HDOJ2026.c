#include <stdio.h>
#include <string.h>

int main(){
	int i,len;
	char s[100];
	while(gets(s)){
		len=strlen(s);
		for(i=0;i<len;i++){
			if(i==0){
				printf("%c",s[i]-32);
			}
			else if(s[i-1]==' '){
				printf("%c",s[i]-32);
			}
			else{
				printf("%c",s[i]);
			}
		}
		printf("\n");
	}
	return 0;
}