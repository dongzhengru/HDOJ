import java.util.Scanner;

public class HDOJ2041 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt(),num;
        int[] s=new int[45];
        s[1]=1;
        s[2]=1;
        s[3]=2;
        while (n-- > 0) {
            num=sc.nextInt();
            for (int i=4;i<=num;i++){
                s[i]=s[i-1]+s[i-2];
            }
            System.out.println(s[num]);
        }
    }
}