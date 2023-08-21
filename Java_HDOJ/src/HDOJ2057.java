import java.util.Scanner;

public class HDOJ2057 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while(sc.hasNext()){
            String str1=sc.next();
            String str2=sc.next();
            String s1=str1.replaceAll("\\+","");
            String s2=str2.replaceAll("\\+","");
            long a=Long.parseLong(s1,16);
            long b=Long.parseLong(s2, 16);
            long sum=a+b;
            if(sum<0){
                System.out.println("-"+Long.toHexString(-sum).toUpperCase());
            }
            else{
                System.out.println(Long.toHexString(sum).toUpperCase());
            }
        }
    }
}