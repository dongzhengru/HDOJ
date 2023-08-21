import java.util.Scanner;

public class HDOJ2077 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        while(n-->0){
            int num=sc.nextInt();
            long[] f=new long[40];
            f[0] = 0;
            for (int i=1;i<num;i++){
                f[i]=3*f[i-1]+2;
            }
            System.out.println(f[num-1]+2);
        }
    }
}