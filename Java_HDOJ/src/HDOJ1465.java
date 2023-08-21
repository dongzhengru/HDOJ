import java.util.Scanner;

public class HDOJ1465 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int i,n;
        long[] f=new long[25];
        f[1]=0;
        f[2]=1;
        while(sc.hasNext()){
            n=sc.nextInt();
            for(i=3;i<=n;i++){
                f[i]=(i-1)*(f[i-1]+f[i-2]);
            }
            System.out.println(f[n]);
        }
    }
}
