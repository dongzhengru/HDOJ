import java.util.Scanner;

public class HDOJ2052 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while(sc.hasNext()){
            int n=sc.nextInt(),m=sc.nextInt();
            System.out.print("+");
            for (int i=1;i<=n;i++){
                System.out.print("-");
            }
            System.out.println("+");
            for (int i=1;i<=m;i++){
                System.out.print("|");
                for (int j=1;j<=n;j++){
                    System.out.print(" ");
                }
                System.out.println("|");
            }
            System.out.print("+");
            for (int i=1;i<=n;i++){
                System.out.print("-");
            }
            System.out.println("+");
            System.out.println();
        }
    }
}