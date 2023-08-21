import java.util.Scanner;

public class HDOJ1013 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String numstr;
        while(true){
            numstr=sc.next();
            int num=0;
            for(int i=0;i<numstr.length();i++){
                num+=numstr.charAt(i)-'0';
            }
            if (num==0) break;
            int res=num;
            while(num>9){
                res=caculate(num);
                num=res;
            }
            System.out.println(res);
        }

    }
    static int caculate(int num){
        int sums=0;
        while(num>0){
            sums+=num%10;
            num/=10;
        }
        return sums;
    }
}