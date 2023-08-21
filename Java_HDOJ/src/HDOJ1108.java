import java.math.BigInteger;
import java.util.Scanner;

public class HDOJ1108 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num;
        while(sc.hasNext()){
            num=sc.nextInt();
            int[] a=new int[num+1];
            int i;
            int max=0;
            for (i=1;i<=num;i++){
                a[i]= sc.nextInt();
                max=Math.max(max,a[i]);
            }
            for(i=1;i<=num;i++){
                if(max%a[i]!=0){
                    i=0;
                    max++;
                }
            }
            System.out.println(max);
        }

    }
}
