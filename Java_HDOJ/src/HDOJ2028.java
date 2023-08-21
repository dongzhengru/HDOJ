import java.math.BigInteger;
import java.util.Scanner;

public class HDOJ2028 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num;
        while(sc.hasNext()){
            int a=sc.nextInt();
            int b=sc.nextInt();
            int max;
            max=Math.max(a,b);
            while(max%a!=0||max%b!=0){
                max++;
            }
            System.out.println(max);
        }
    }
}
