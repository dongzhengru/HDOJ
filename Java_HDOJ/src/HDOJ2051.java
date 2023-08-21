import java.util.Scanner;

public class HDOJ2051 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            int n = sc.nextInt();
            System.out.println(Integer.toBinaryString(n));
        }
    }
}
