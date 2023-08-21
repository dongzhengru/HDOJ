import java.math.BigInteger;
import java.util.Scanner;

public class HDOJ1042 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t;
        while (sc.hasNext()){
            t= sc.nextInt();
            if (t==0){
                System.out.println("1");
            }
            else {
                BigInteger sum=new BigInteger("1");
                BigInteger a=new BigInteger("1");
                BigInteger one=new BigInteger("1");
                for (int i=0;i<t;i++){
                    sum=sum.multiply(a);
                    a=a.add(one);
                }
                System.out.println(sum);
            }
        }
    }
}
