import java.util.Scanner;

public class HDOJ2042 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt(),num;
        while (n-- > 0) {
            num=sc.nextInt();
            int sum=3;
            for (int i=1;i<=num;i++){
                sum--;
                sum*=2;
            }
            System.out.println(sum);
        }
    }
}