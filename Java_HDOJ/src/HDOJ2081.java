import java.util.Scanner;

public class HDOJ2081 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n = sc.nextInt();
        while(n-->0){
            long i = sc.nextLong();
            long five = i%100000;
            System.out.println(600000+five);
        }
    }
}