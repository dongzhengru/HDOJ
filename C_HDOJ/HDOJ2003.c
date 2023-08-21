#include <stdio.h>
#include <math.h>

int main(){
	double a;
	while(~scanf("%lf",&a)){
		if(a<0){
			a=-a;
		}
		printf("%.2lf\n",a);
	}
	return 0;
}