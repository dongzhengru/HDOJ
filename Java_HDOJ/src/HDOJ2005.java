import java.util.Scanner;

public class HDOJ2005 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while (sc.hasNext()){
            String numstr=sc.next();
            char[] s=numstr.toCharArray();
            int i,year=0,month=0,day=0,xg=0;
            for(i=0;i<s.length;i++){
                if (s[i]=='/'){
                    xg++;
                    continue;
                }
                if (xg==0){
                    year=year*10+s[i]-'0';
                }
                else if (xg==1) {
                    month=month*10+s[i]-'0';
                }
                else if(xg==2){
                    day=day*10+s[i]-'0';
                }
            }
            int[] mdays={0,31,28,31,30,31,30,31,31,30,31,30,31};
            int sum=0;
            for (i=1;i<month;i++){
                sum+=mdays[i];
            }
            sum+=day;
            if (((year%4==0&&year%100!=0)||year%400==0)&&month>=3){
                sum++;
            }
            System.out.println(sum);
        }
    }
}
