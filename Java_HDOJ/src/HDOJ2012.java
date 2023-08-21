import java.util.Scanner;

public class HDOJ2012 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int x, y,flag,i,j;
        double m=0,num=0;
        while(true) {
            x=sc.nextInt();
            y=sc.nextInt();
            if (x==0&&y==0){
                break;
            }
            flag=1;
            for(i=x;i<=y;i++) {
                num=i*i+i+41;
                m=Math.sqrt(num+0.5);
                for(j=2;j<=m;j++){
                    if(num%j==0){
                        flag = 0;
                        break;
                    }
                    if(flag==0){
                        break;
                    }
                }
                if(flag==0){
                    break;
                }
            }
            if(flag==1){
                System.out.println("OK");
            }
            else{
                System.out.println("Sorry");
            }
        }
    }
}
