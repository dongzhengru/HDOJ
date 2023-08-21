import java.util.Scanner;

public class HDOJ2010 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int m,n,a,b,c,num;
        while(sc.hasNext()){
            m= sc.nextInt();
            n= sc.nextInt();
            num=0;
            a=m/100;
            b=m/10-10*a;
            c=m%10;
            for(;m<=n;m++){
                a=m/100;
                b=m/10-10*a;
                c=m%10;
                if(m == a*a*a+b*b*b+c*c*c){
                    if (num>0){
                        System.out.printf(" %d",m);
                    }
                    else {
                        System.out.printf("%d",m);
                    }
                    num++;
                }
            }
            if(num == 0){
                System.out.printf("no");
            }
            System.out.println();
        }
    }
}
