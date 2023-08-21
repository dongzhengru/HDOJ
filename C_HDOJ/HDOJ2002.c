#include <stdio.h>
#include <math.h>
#define PI 3.1415927

int main(){
	double r;
	while(~scanf("%lf",&r)){
		printf("%.3lf\n",4.0/3.0*PI*r*r*r);
	}
	return 0;
}