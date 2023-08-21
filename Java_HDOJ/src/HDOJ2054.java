import java.math.BigDecimal;
import java.util.Scanner;

public class HDOJ2054 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while(sc.hasNext()){
            String number1=sc.next();
            String number2=sc.next();
            BigDecimal a=new BigDecimal(number1);
            BigDecimal b=new BigDecimal(number2);
            if(a.compareTo(b)==0){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }
        }
    }
}