import java.util.Scanner;

public class HDOJ2132 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        long[] sum=new long[100005];
        for (int i=1;i<sum.length;i++){
            if (i%3==0){
                sum[i]=sum[i-1]+(long)i*i*i;
            }
            else{
                sum[i]=sum[i-1]+(long)i;
            }
        }
        while(sc.hasNext()){
            int n=sc.nextInt();
            if(n<0){
                break;
            }
            System.out.println(sum[n]);
        }
    }
}