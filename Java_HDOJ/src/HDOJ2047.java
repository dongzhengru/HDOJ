import java.util.Scanner;

public class HDOJ2047 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while(sc.hasNext()){
            int n = sc.nextInt();
            long[] f = new long[45];
            f[1] = 3;
            f[2] = 8;
            for (int i=3;i<=n;i++){
                f[i]=((f[i-1]+f[i-2])*2);
            }
            System.out.println(f[n]);
        }
    }
}