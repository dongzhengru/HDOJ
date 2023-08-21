import java.util.Scanner;

public class HDOJ1094 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while(sc.hasNext()) {
            int sum=0;
            int num= sc.nextInt();
            for (int i=1;i<=num;i++){
                int a = sc.nextInt();
                sum+=a;
            }
            System.out.println(sum);
        }
    }
}
