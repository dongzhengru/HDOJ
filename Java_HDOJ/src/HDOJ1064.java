import java.util.Scanner;

public class HDOJ1064 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        double[] money=new double[13];
        int i;
        double sum=0;
        for (i=1;i<=12;i++){
            money[i]=sc.nextDouble();
            sum+=money[i];
        }
        System.out.printf("$%.2f",sum/12);
        System.out.println();
    }
}
