import java.util.Scanner;

public class HDOJ1877{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            int m = sc.nextInt();
            if (m==0) {
                break;
            }
            long a = sc.nextLong();
            long b = sc.nextLong();
            a += b;
            String num = "";
            while(a>0){
                num = a%m+num;
                a /= m;
            }
            if ("".equals(num)) {
                System.out.println(0);
                continue;
            }
            System.out.println(num);
        }
    }
}