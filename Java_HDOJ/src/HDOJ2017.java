import java.util.Scanner;

public class HDOJ2017 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int i,n,sum;
        n=sc.nextInt();
        while(n-->0){
            String s;
            sum=0;
            s=sc.next();
            char[] str=s.toCharArray();
            for(i=0;i<str.length;i++){
                if(str[i]>='0'&&str[i]<='9'){
                    sum++;
                }
            }
            System.out.println(sum);
        }
    }
}
