#include <stdio.h>
#include <string.h>
#define N 100
#define M 100000
long a[1000][N];
void add(long *a,long *b,long *c){
	int i,carry;
	carry=0;
	for(i=N-1;i>=0;i--){
        c[i]=a[i]+b[i]+carry;
        carry = 0;
		if (c[i]>=M){
            c[i]-=M;
            carry=1;
        }
    }
}

int main(){
	int i,n;
	
	while(~scanf("%d",&n)){
		result();
	}
	return 0;
}