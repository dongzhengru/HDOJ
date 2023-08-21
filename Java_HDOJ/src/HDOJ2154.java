import java.util.Scanner;

public class HDOJ2154 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int i,n;
        int[] a=new int[1001];
        a[1]=0;
        a[2]=2;
        for(i=3;i<=1000;i++){
            a[i]=(a[i-1]+2*a[i-2])%1000;
        }
        while(sc.hasNext()){
            n=sc.nextInt();
            if (n==0){
                break;
            }
            System.out.println(a[n]);
        }
    }
}