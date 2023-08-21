import java.util.Scanner;

public class HDOJ2016 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while (true){
            int n= sc.nextInt();
            if (n==0){
                break;
            }
            int[] s=new int[n];
            int i,min=100000,min_i=0,tmp;
            for (i=0;i<n;i++){
                s[i]=sc.nextInt();
                if (s[i] < min) {
                    min=s[i];
                    min_i=i;
                }
            }
            tmp=s[0];
            s[0]=s[min_i];
            s[min_i]=tmp;
            System.out.print(s[0]);
            for (i=1;i<n;i++){
                System.out.print(" "+s[i]);
            }
            System.out.println();
        }
    }
}
