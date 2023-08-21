import java.util.Scanner;

public class HDOJ1097{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int n = sc.nextInt();
            int m = sc.nextInt();
            n%=10;
            m=m%4+3;
            int res=n;
            for (int i=1;i<=m; i++) {
                res *= n;
                res %= 10;
            }
            System.out.println(res);
        }
    }
}