import java.util.Scanner;

public class HDOJ1018{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n = sc.nextInt();
        while (n-->0){
            int num=sc.nextInt();
            double sum=0;
            for (int i=1;i<=num;i++){
                sum+=Math.log10(i);
            }
            System.out.println(((int)sum)+1);
        }
    }
}