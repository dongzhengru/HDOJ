import java.util.Scanner;

public class HDOJ2003 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        double a;
        while(sc.hasNext()){
            a= sc.nextDouble();
            if(a<0){
                a=-a;
            }
            System.out.printf("%.2f",a);
            System.out.println();
        }
    }
}
