import java.util.Scanner;

public class HDOJ2035 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while(sc.hasNext()){
            int a=sc.nextInt();
            int b=sc.nextInt();
            if(a==0&&b==0){
                break;
            }
            int x=a;
            for(int i=1;i<b;i++){
                x=(x*a)%1000;
            }
            System.out.println(x);
        }
    }

}
