import java.util.Scanner;

public class HDOJ2188 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int c=sc.nextInt();
        int n,m;
        while(c-->0){
            n=sc.nextInt();
            m=sc.nextInt();
            if(n%(m+1)!=0){
                System.out.println("Grass");
            }
            else{
                System.out.println("Rabbit");
            }
        }
    }
}