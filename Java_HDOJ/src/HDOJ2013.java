import java.util.Scanner;

public class HDOJ2013 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while (true){
            int days= sc.nextInt();
            int i,sum=1;
            for (i=days-1;i>=1;i--){
                sum=sum*2+2;
            }
            System.out.println(sum);
        }
    }
}
