import java.util.Scanner;

public class HDOJ1197 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int i;
        for (i=1000;i<=9999;i++){
            if (shi(i)==shier(i)&&shier(i)==shiliu(i)){
                System.out.println(i);
            }
        }
    }
    static int shi(int num) {
        int sum=0,tmp;
        while (num!=0){
            tmp=num%10;
            sum+=tmp;
            num/=10;
        }
        return sum;
    }
    static int shiliu(int num) {
        int sum=0,tmp;
        while (num!=0){
            tmp=num%16;
            sum+=tmp;
            num/=16;
        }
        return sum;
    }
    static int shier(int num) {
        int sum=0,tmp;
        while (num!=0){
            tmp=num%12;
            sum+=tmp;
            num/=12;
        }
        return sum;
    }
}
