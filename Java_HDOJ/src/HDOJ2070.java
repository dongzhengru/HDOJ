import java.math.BigInteger;
import java.util.Scanner;

public class HDOJ2070 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        BigInteger[] f=new BigInteger[55];
        f[0]=BigInteger.valueOf(0);
        f[1]=BigInteger.valueOf(1);
        while(sc.hasNext()){
            int num=sc.nextInt();
            if (num==-1){
                break;
            }
            for (int i=2;i<=num;i++){
                f[i]=f[i-1].add(f[i-2]);
            }
            System.out.println(f[num]);
        }
    }
}