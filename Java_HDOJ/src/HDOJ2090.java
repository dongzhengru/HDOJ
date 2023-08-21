import java.util.Scanner;

public class HDOJ2090{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double sum = 0;
        while (sc.hasNext()) {
            sc.next();
            double amount = sc.nextDouble();
            double price = sc.nextDouble();
            sum += amount*price;
        }
        System.out.printf("%.1f",sum);
        System.out.println();
    }
}