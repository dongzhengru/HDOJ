import java.util.Scanner;

public class HDOJ2007 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int i,j,x,y,t,sum1,sum2;	//sum1:2,4,6...;sum2:1,3,5...
        while(sc.hasNext()){
            x= sc.nextInt();
            y= sc.nextInt();
            sum1=0;
            sum2=0;
            if(x>y){
                t=x;
                x=y;
                y=t;
            }
            if(x % 2 == 0){
                for(i=x;i<=y;i+=2){
                    sum1+=i*i;
                }
                for(j=x+1;j<=y;j+=2){
                    sum2+=j*j*j;
                }
            }
            else{
                for(i=x+1;i<=y;i+=2){
                    sum1+=i*i;
                }
                for(j=x;j<=y;j+=2){
                    sum2+=j*j*j;
                }
            }
            System.out.println(sum1+" "+sum2);
        }
    }
}
