import java.util.Scanner;

public class HDOJ2011 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int j,m,n;
        float sum;
        m= sc.nextInt();
        while(m-->0){
            sum=0;
            n=sc.nextInt();
            for(j=1;j<=n;j++){
                if(j%2==0.0){
                    sum-=1.0/j;
                }
                else{
                    sum+=1.0/j;
                }
            }
            System.out.printf("%.2f",sum);
            System.out.println();
        }
    }
}
