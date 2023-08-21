import java.util.Scanner;

public class HDOJ2064 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            int n=sc.nextInt();
            long[] f=new long[40];
            f[0] = 0;
            for (int i=1;i<f.length;i++){
                f[i]=3*f[i-1]+2;
            }
            System.out.println(f[n]);
        }
    }
}
