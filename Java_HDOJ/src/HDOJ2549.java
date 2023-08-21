import java.util.Scanner;

public class HDOJ2549 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        while (n-->0){
            String num = sc.next();
            int index = num.indexOf('.');
            int weishu=sc.nextInt();
            if (weishu+index>num.length()-1) {
                System.out.println(0);
                continue;
            }
            System.out.println(num.charAt(index+weishu));
        }
    }
}