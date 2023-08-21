import java.util.Scanner;

public class HDOJ2039 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        double a,b,c;
        boolean flag;
        while(n-->0){
            flag=true;
            a=sc.nextDouble();
            b=sc.nextDouble();
            c=sc.nextDouble();
            if(a+b<=c){
                flag=false;
            }
            else if(a+c<=b){
                flag=false;
            }
            else if(b+c<=a){
                flag=false;
            }
            if (flag){
                System.out.println("YES");
            }
            else {
                System.out.println("NO");
            }
        }
    }
}