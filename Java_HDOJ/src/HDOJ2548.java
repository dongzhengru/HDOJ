import java.util.Scanner;

public class HDOJ2548 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            double u = sc.nextDouble();
            double v = sc.nextDouble();
            double w = sc.nextDouble();
            double l = sc.nextDouble();
            System.out.printf("%.3f",l/(u+v)*w);
            System.out.println();
        }
    }
}