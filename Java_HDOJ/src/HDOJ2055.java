import java.util.Scanner;

public class HDOJ2055 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        sc.nextLine();
        while(n-->0){
            String str=sc.next();
            int m=sc.nextInt();
            char c=str.charAt(0);
            int s;
            if(c>='A'&&c<='Z'){
                s=c-64;
            }else{
                s=-1*((int)c-96);
            }
            System.out.println(s+m);
        }
    }
}