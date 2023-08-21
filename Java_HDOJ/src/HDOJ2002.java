import java.util.Scanner;

public class HDOJ2002 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        double r,PI=3.1415927;
        while(sc.hasNext()){
            r= sc.nextDouble();
            System.out.printf("%.3f",4.0/3.0*PI*r*r*r);
            System.out.println();
        }
    }
}
