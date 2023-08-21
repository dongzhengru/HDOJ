import java.util.Scanner;

public class HDOJ1008 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        int i;
        int num;
        while(n!=0){
            int sum=0;
            int tmp=0;
            for (i=1;i<=n;i++){
                num= sc.nextInt();
                if (num>=tmp){
                    sum+=(num-tmp)*6+5;
                    tmp=num;
                }
                else if (tmp>num){
                    sum+=(tmp-num)*4+5;
                    tmp=num;
                }
            }
            System.out.println(sum);
            n= sc.nextInt();
        }
    }
}
