import java.util.*;
import java.math.*;

public class HDOJ1250 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        BigInteger[] f=new BigInteger[10100];
        f[1]=f[2]=f[3]=f[4]=BigInteger.valueOf(1);
        for(int i = 5 ; i <= 10000 ; i++){
            f[i] = f[i - 1].add(f[i - 2].add(f[i - 3].add(f[i - 4])));
        }
        int n ;
        while(sc.hasNext()){
            n=sc.nextInt();
            System.out.println(f[n]);
        }
    }
}