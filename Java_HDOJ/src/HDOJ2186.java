import java.util.Scanner;

public class HDOJ2186 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        while(n-->0){
            int num=sc.nextInt();
            int a=num/2;
            num-=a;
            int b=num*2/3;
            num-=b;
            int c=num;
            if (a%10==0){
                a/=10;
            }
            else if(a<=10){
                a=1;
            }
            else{
                a/=10;
                a++;
            }
            if (b%10==0){
                b/=10;
            }
            else if(b<=10){
                b=1;
            }
            else {
                b/=10;
                b++;
            }
            if (c%10==0){
                c/=10;
            }
            else if(c<=10){
                c=1;
            }
            else {
                c/=10;
                c++;
            }
            System.out.println(a+b+c);
        }
    }
}