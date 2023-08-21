import java.util.Scanner;

public class HDOJ2043 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        String psw;
        while (n-- > 0) {
            psw=sc.next();
            if (psw.length()<8||psw.length()>16){
                System.out.println("NO");
                continue;
            }
            int[] judge=new int[4];
            for (int i=0;i<psw.length();i++){
                if (psw.charAt(i)>=65&&psw.charAt(i)<=90){
                    judge[0]=1;
                }
                else if(psw.charAt(i)>=97&&psw.charAt(i)<=122){
                    judge[1]=1;
                }
                else if(psw.charAt(i)>=48&&psw.charAt(i)<=57){
                    judge[2]=1;
                }
                else{
                    switch(psw.charAt(i)){
                        case '~' : judge[3]=1;continue;
                        case '!' : judge[3]=1;continue;
                        case '@' : judge[3]=1;continue;
                        case '#' : judge[3]=1;continue;
                        case '$' : judge[3]=1;continue;
                        case '%' : judge[3]=1;continue;
                        case '^' : judge[3]=1;
                    }
                }
            }
            for(int i=1;i<=3;i++){
                judge[0]+=judge[i];
                judge[i]=0;
            }
            if (judge[0]>=3){
                System.out.println("YES");
                judge[0]=0;
            }
            else{
                System.out.println("NO");
            }
        }
    }
}