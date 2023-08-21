import java.util.Scanner;

public class HDOJ2018 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int i,n;
        int[] sum=new int[56];
        while(sc.hasNext()){
            n= sc.nextInt();
            if(n==0){
                break;
            }
            sum[1]=1;
            sum[2]=2;
            sum[3]=3;
            for(i=4;i<=n;i++){
                sum[i]=sum[i-1]+sum[i-3];
            }
            System.out.println(sum[n]);
        }
    }
}
