import java.util.Scanner;

public class HDOJ1229{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while (sc.hasNext()){
            int a=sc.nextInt(),b=sc.nextInt(),k=sc.nextInt();
            if (a==0&&b==0) {
                break;
            }
            int tmp_a=a,tmp_b=b;
            boolean flag=true;
            while (k-->0){
                if (tmp_a%10!=tmp_b%10) {
                    flag=false;
                    break;
                }
                tmp_a/=10;
                tmp_b/=10;
            }
            if (flag){
                System.out.println(-1);
            }
            else{
                System.out.println(a+b);
            }
        }
    }
}
