import java.util.Scanner;

public class HDOJ2006 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n,number,sum;
        while(sc.hasNext()){
            n=sc.nextInt();
            sum = 1;
            while(n-->0){
                number=sc.nextInt();
                if(number % 2 != 0){
                    sum *= number;
                }
            }
            System.out.println(sum);
        }
    }
}
