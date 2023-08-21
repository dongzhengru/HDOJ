import java.math.BigInteger;
import java.util.Scanner;

public class HDOJ2045 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n;
        BigInteger[] f=new BigInteger[55];
        while(sc.hasNext()){
            n=sc.nextInt();
            f[1]=BigInteger.valueOf(3);
            f[2]=BigInteger.valueOf(6);
            f[3]=BigInteger.valueOf(6);
            for (int i=4;i<=n;i++){
                f[i]=f[i-1].add(BigInteger.valueOf(2).multiply(f[i-2]));
            }
            System.out.println(f[n]);
        }
    }
}