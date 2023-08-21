import java.util.Arrays;
import java.util.Scanner;

public class HDOJ2071 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        while(n-->0){
            int num=sc.nextInt();
            double[] f=new double[num];
            for (int i=0;i<num;i++){
                f[i]=sc.nextDouble();
            }
            double max=-1;
            for (double tmp:f){
                max=Math.max(tmp,max);
            }
            System.out.printf("%.2f",max);
            System.out.println();
        }
    }
}