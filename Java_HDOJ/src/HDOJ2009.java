import java.util.Scanner;

public class HDOJ2009 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int i,m;
        double n,t,result;
        while(sc.hasNext()){
            n= sc.nextDouble();
            m= sc.nextInt();
            result=n;
            t=n;
            for(i=0;i<m-1;i++){
                n=Math.sqrt(n);
                result+=n;
            }
            System.out.printf("%.2f",result);
            System.out.println();
        }
    }
}
