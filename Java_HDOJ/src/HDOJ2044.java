import java.math.BigInteger;
import java.util.Scanner;

public class HDOJ2044 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt(),a,b;
        BigInteger[] f=new BigInteger[55];
        while (n-- > 0) {
            a=sc.nextInt();
            b=sc.nextInt();
            f[1]=BigInteger.valueOf(1);
            f[2]=BigInteger.valueOf(2);
            f[3]=BigInteger.valueOf(3);
            for (int i=4;i<=b-a;i++){
                f[i]=f[i-1].add(f[i-2]);
            }
            System.out.println(f[b-a]);
        }
    }
}