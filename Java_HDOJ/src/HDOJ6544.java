import java.util.Scanner;

public class HDOJ6544 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        double sum=0, now;
        for (int i=1;i<=n;i++){
            now=sc.nextDouble();
            if (sum<100||sum>=400){
                sum+=now;
            }
            else if (sum>=100&&sum<150){
                sum+=now*0.8;
            }
            else{
                sum+=now*0.5;
            }
        }
        System.out.printf("%.2f",sum);
        System.out.println();
    }
}