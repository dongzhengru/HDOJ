import java.math.BigInteger;
import java.util.Scanner;

public class HDOJ1019 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        int num;
        while(n>0){
            num=sc.nextInt();
            int[] a=new int[num+1];
            int i;
            int max=0;
            for (i=1;i<=num;i++){
                a[i]= sc.nextInt();
                max=Math.max(max,a[i]);
            }
            int bg=max;
            for(i=1;i<=num;i++){
                if(bg%a[i]!=0){
                    i=0;
                    bg+=max;
                }
            }
            System.out.println(bg);
            n--;
        }
    }
}
