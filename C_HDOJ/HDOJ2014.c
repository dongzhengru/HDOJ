#include<stdio.h>

int main() {
	int n;
	double sum, score, max, min;
	while(scanf("%d", &n)!=EOF) {
		sum = 0; max = -1; min = 1e8;
		for(int i = 0; i < n; i++) {
			scanf("%lf", &score);
			sum += score;
			if(score > max) max = score; 
			if(score < min) min = score;
		}
		sum = sum-max-min;
		printf("%.2lf\n", sum/(n-2));
	}
	return 0; 
}