import java.util.Scanner;

public class HDOJ2123{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n = sc.nextInt();
        while(n-->0){
            int line=sc.nextInt();
            for (int i=1;i<=line;i++) {
                for (int j=1;j<=line;j++) {
                    if(j==1){
                        System.out.print(i*j);
                    }
                    else {
                        System.out.print(" "+i*j);
                    }
                }
                System.out.println();
            }
        }
    }
}