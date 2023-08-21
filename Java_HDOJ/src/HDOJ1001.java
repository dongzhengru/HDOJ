import java.util.Scanner;

public class HDOJ1001 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int i;
        while(sc.hasNext()){
            int sum=0;
            int n=sc.nextInt();
            for (i=1;i<=n;i++){
                sum+=i;
            }
            System.out.println(sum);
            System.out.println();
            n--;
        }
    }
}