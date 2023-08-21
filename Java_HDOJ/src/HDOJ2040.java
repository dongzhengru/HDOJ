import java.util.Scanner;

public class HDOJ2040 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt(),a,b;
        while(n-->0){
            a=sc.nextInt();
            b=sc.nextInt();
            int sum=1;
            for (int i=2;i<a;i++){
                if (a%i==0){
                    sum+=i;
                }
            }
            if (sum!=b){
                System.out.println("NO");
            }
            else {
                sum=1;
                for (int i=2;i<b;i++){
                    if (b%i==0){
                        sum+=i;
                    }
                }
                if (sum==a){
                    System.out.println("YES");
                }
                else {
                    System.out.println("NO");
                }
            }
        }
    }
}