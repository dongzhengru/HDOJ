import java.util.Scanner;

public class HDOJ2001 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        double x1,x2,y1,y2;
        while(sc.hasNext()){
            x1=sc.nextDouble();
            y1=sc.nextDouble();
            x2=sc.nextDouble();
            y2=sc.nextDouble();
            System.out.printf("%.2f",Math.sqrt((x2-x1)*(x2-x1)+(y2-y1)*(y2-y1)));
            System.out.println();
        }
    }
}
