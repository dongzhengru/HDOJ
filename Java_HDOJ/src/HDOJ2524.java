import java.util.Scanner;

public class HDOJ2524{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            int m = sc.nextInt();
            System.out.println((n*(n+1)/2)*(m*(m+1)/2));
        }
    }
}