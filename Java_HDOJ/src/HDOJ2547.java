import java.util.Scanner;

public class HDOJ2547{
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            double a = sc.nextDouble();
            double b = sc.nextDouble();
            double c = sc.nextDouble();
            double d = sc.nextDouble();
            System.out.printf("%.1f",Math.sqrt((a-c)*(a-c)+(b-d)*(b-d)));
            System.out.println();
        }
    }
}