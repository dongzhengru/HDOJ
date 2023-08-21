import java.util.Scanner;

public class HDOJ2552 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            double s = sc.nextDouble();
            double u = sc.nextDouble();
            double v = 1.0/Math.tan(Math.atan(1.0/s)-Math.atan(1.0/u));
            System.out.printf("%.0f",v*u-s*u-s*v);
            System.out.println();
        }
    }
}