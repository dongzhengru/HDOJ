#include <stdio.h>
#include <string.h>

int main(){
	int i,n,len,sum;
	char str[50];
	scanf("%d",&n);
	getchar();
	while(n--){
		sum=0;

		gets(str);
		len=strlen(str);
		if(str[0]>='0'&&str[0]<='9'){
			printf("no\n");
		}
		else{
			for(i=0;i<len;i++){
				if((str[i] >= '0' && str[i] <= '9')||(str[i] >= 'a' && 
            		str[i] <= 'z')||(str[i] >= 'A' && str[i] <= 'Z')||str[i] == '_'){
					sum++;
				}
			}
			if(len==sum){
				printf("yes\n");
			}
			else{
				printf("no\n");
			}
		}
		
	}
	return 0;
}