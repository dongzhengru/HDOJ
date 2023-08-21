import java.util.Scanner;

public class HDOJ2075 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        while(n-->0){
            int a=sc.nextInt(),b=sc.nextInt();
            if (a%b==0){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }
        }
    }
}