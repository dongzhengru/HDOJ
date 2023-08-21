import java.util.Scanner;

public class HDOJ1092 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while(sc.hasNext()) {
            int n = sc.nextInt();
            if (n==0){
                break;
            }
            int sum=0;
            for (int i=1;i<=n;i++){
                int a = sc.nextInt();
                sum+=a;
            }
            System.out.println(sum);
        }
    }
}
