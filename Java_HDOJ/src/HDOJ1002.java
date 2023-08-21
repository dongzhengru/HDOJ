import java.math.BigInteger;
import java.util.Scanner;

public class HDOJ1002 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int n=sc.nextInt();
        int num=1;
        while(n>0){
            BigInteger a=sc.nextBigInteger();
            BigInteger b=sc.nextBigInteger();
            System.out.printf("Case %d:",num);
            System.out.println();
            System.out.printf("%d + %d = ",a,b);
            System.out.println(a.add(b));
            if (n!=1){
                System.out.println();
            }
            num++;
            n--;
        }
    }
}
