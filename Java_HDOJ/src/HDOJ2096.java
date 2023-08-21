import java.util.Scanner;

public class HDOJ2096 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        while(n-->0){
            int a=sc.nextInt();
            int b=sc.nextInt();
            a%=100;
            b%=100;
            System.out.println((a+b)%100);
        }
    }
}