import java.util.Scanner;

public class HDOJ1061 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=0;
        int n= sc.nextInt();
        int[] s={0,1,4,7,6,5,6,3,6,9,0,1,6,3,6,5,6,7,4,9,0};
        while(n>0){
            num=sc.nextInt();
            System.out.println(s[num%20]);
            n--;
        }
    }
}
