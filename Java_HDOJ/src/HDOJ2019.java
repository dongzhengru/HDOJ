import java.util.Scanner;

public class HDOJ2019 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while (true) {
            int n= sc.nextInt();
            int m= sc.nextInt();
            if (n==0&&m==0){
                break;
            }
            int[] s=new int[n+2];
            int i,t,insert=0;
            for (i=0;i<n;i++){
                s[i]= sc.nextInt();
                if (s[i]<=m){
                    insert=i;
                }
            }
            for (i=n;i>insert;i--){
                s[i]=s[i-1];
            }
            s[insert+1]=m;
            System.out.print(s[0]);
            for (i=1;i<n+1;i++){
                System.out.print(" "+s[i]);
            }
            System.out.println();
        }
    }
}
