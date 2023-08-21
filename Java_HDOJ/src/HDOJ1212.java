import java.math.BigInteger;
import java.util.Scanner;

public class HDOJ1212 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while (sc.hasNext()){
            BigInteger a=sc.nextBigInteger(),b=sc.nextBigInteger();
            System.out.println(a.remainder(b));
        }
    }
}