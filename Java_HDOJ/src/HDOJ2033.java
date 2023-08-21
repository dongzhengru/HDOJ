import java.util.Scanner;

public class HDOJ2033 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] num = new int[6];
        while (n-- > 0) {
            num[0] = 0;
            num[1] = 0;
            num[2] = 0;
            for (int j = 0; j <= 5; j++) {
                num[j] = sc.nextInt();
            }
            num[0] += num[3];
            num[1] += num[4];
            num[2] += num[5];
            num[1] += num[2] / 60;
            num[2] %= 60;
            num[0] += num[1] / 60;
            num[1] %= 60;
            System.out.println(num[0] + " " + num[1] + " " + num[2]);
        }
    }
}