#include <stdio.h>
#include <string.h>

int main(){
	char a,b,c,d,t;
	while(~scanf("%c%c%c%c",&a,&b,&c,&d)){
		if(b>c){
			t=b;b=c;c=t;
		}
    	if(a>c){
			t=a;a=c;c=t;
		}
	    if(a>b){
			t=a;a=b;b=t;
		}
		printf("%c %c %c\n",a,b,c);
	}
	return 0;
}