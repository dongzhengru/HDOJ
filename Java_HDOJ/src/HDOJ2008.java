import java.util.Scanner;

public class HDOJ2008 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int i,n,sum1,sum2,sum3;
        float number;
        while(sc.hasNext()){
            n= sc.nextInt();
            if (n==0){
                break;
            }
            i=n;
            sum1=0;
            sum2=0;
            sum3=0;
            for(i=0;i<n;i++){
                number= sc.nextFloat();
                if(number>0){
                    sum3++;
                }
                else if(number<0){
                    sum1++;
                }
                else{
                    sum2++;
                }
            }
            System.out.println(sum1+" "+sum2+" "+sum3);
        }
    }
}
