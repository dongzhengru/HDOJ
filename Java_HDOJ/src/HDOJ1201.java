import java.util.Scanner;

public class HDOJ1201 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        while(n-->0){
            String data= sc.next();
            char[] str=data.toCharArray();
            int sum=365*18;
            int i,xg=0;
            int year=0,month=0,day=0;
            for (i=0;i< str.length;i++){
                if (str[i]=='-'){
                    xg++;
                }
                else if (xg==0){
                    year=year*10+(str[i]-'0');
                }
                else if (xg==1){
                    month=month*10+(str[i]-'0');
                }
                else {
                    day=day*10+(str[i]-'0');
                }
            }
            for (i=year+1;i<year+18;i++){
                if ((i%4==0&&i%100!=0)||i%400==0){
                    sum++;
                }
            }
            if(((year%4==0&&year%100!=0)||year%400==0)&&month<=2)
                sum++;
            if((((year+18)%4==0&&(year+18)%100!=0)||(year+18)%400==0)&&month>=3)
                sum++;
            if(month==2&&day==29)
                System.out.println("-1");
            else
                System.out.println(sum);
        }
    }
}
