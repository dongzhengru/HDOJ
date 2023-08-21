#include <stdio.h>

int main(){
	int i,year,month,day,sum;
	int months[12]={31,28,31,30,31,30,31,31,30,31,30,31};
	while(~scanf("%d/%d/%d",&year,&month,&day)){
		sum = 0;
		for(i=0;i<month-1;i++){
			sum += months[i];
		}
		sum += day;
		if(month>2 &&((year%4 == 0 && year%100 != 0) || year%400 == 0)){
			sum ++;
		}
		printf("%d\n",sum);
	}
	return 0;
}
