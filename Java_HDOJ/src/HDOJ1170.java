import java.util.Scanner;

public class HDOJ1170 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        String tool;
        int a,b,res1=0;
        double res2=0.00;
        while(n-->0){
            tool=sc.next();
            a=sc.nextInt();
            b=sc.nextInt();
            switch (tool){
                case "+" : res1=a+b;break;
                case "-" : res1=a-b;break;
                case "*" : res1=a*b;break;
                case "/" : res2=(double)a/b;break;
            }
            if (tool.equals("/")){
                if (res2%1==0){
                    System.out.printf("%.0f",res2);
                }
                else {
                    System.out.printf("%.2f",res2);
                }
                System.out.println();
            }
            else {
                System.out.println(res1);
            }
        }
    }
}