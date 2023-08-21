import java.util.Scanner;

public class HDOJ1062{  //PE???
    public static String Reverse(String s){
        int len=s.length();
        if(s.length()<=1){
            return s;
        }
        String left=s.substring(0, len/2);
        String right=s.substring(len/2, len);
        return Reverse(right)+Reverse(left);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        String text=sc.nextLine();
        while(n-->0){
            text=sc.nextLine();
            String[] str=text.split(" ");
            for (int i=0;i<str.length;i++){
                str[i]=Reverse(str[i]);
            }
            for (int i=0;i<str.length-1;i++){
                System.out.print(str[i]+" ");
            }
            System.out.print(str[str.length-1]);
            System.out.println();
        }
    }
}
