#include <stdio.h>
#include <string.h>

int main(){
	int n,i,j,len;
	scanf("%d",&n);
	getchar();
	while(n--){
		char s[150];
		fgets(s,110,stdin);
		int num1=0,num2=0,num3=0,num4=0,num5=0;
		len=strlen(s);
		for(i=0;i<len;i++){
			switch(s[i]){
				case 'a':num1++;break;
				case 'e':num2++;break;
				case 'i':num3++;break;
				case 'o':num4++;break;
				case 'u':num5++;break;
			}
		}
		printf("a:%d\n",num1);
        printf("e:%d\n",num2);
        printf("i:%d\n",num3);
        printf("o:%d\n",num4);
        printf("u:%d\n",num5);
		if(n>0){
			printf("\n");
		}	
	}
	return 0;
}