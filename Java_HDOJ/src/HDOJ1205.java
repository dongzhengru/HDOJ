import java.util.Scanner;

public class HDOJ1205 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int n=sc.nextInt();
            int i,tmp,sum=0,max=0;
            for (i=0;i<n;i++){
                tmp=sc.nextInt();
                if (tmp>max){
                    max=tmp;
                }
                sum+=tmp;
            }
            if (max-(sum-max)<=1){
                System.out.println("Yes");
            }
            else {
                System.out.println("No");
            }
        }
    }
}
