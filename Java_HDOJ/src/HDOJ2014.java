import javax.security.sasl.SaslClient;
import java.util.Scanner;

public class HDOJ2014 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while (true){
            int n=sc.nextInt();
            double num=0,sum=0;
            while (n-->0){
                sum+=sc.nextInt();
                num++;
            }
            double res=sum/num;
            System.out.printf("%.2f",res);
            System.out.println();
        }
    }
}
