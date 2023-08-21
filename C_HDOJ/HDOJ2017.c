#include <stdio.h>
#include <string.h>

int main(){
	int i,n,sum;
	char str[100];
	scanf("%d",&n);
	while(n--){
	sum=0;
		scanf("%s",str);
		for(i=0;str[i]!='\0';i++){
			if(str[i]>='0'&&str[i]<='9'){
				sum++;
			}
		}
		printf("%d\n",sum);
	}
	return 0;
}