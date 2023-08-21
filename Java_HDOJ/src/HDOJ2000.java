import java.util.Scanner;

public class HDOJ2000 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        char a,b,c,t;
        String str;
        while(sc.hasNext()){
            str=sc.next();
            char[] s=str.toCharArray();
            a=s[0];
            b=s[1];
            c=s[2];
            if(b>c){
                t=b;b=c;c=t;
            }
            if(a>c){
                t=a;a=c;c=t;
            }
            if(a>b){
                t=a;a=b;b=t;
            }
            System.out.println(a+" "+b+" "+c);
        }
    }
}
