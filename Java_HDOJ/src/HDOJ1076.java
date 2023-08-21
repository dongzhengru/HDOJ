import java.util.Scanner;

public class HDOJ1076 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        while(n-->0){
            int years=sc.nextInt();
            int num=sc.nextInt();
            int t=0;
            while(t!=num){
                if ((years%4==0&&years%100!=0)||years%400==0){
                    t++;
                }
                years++;
            }
            System.out.println(years-1);
        }
    }
}
