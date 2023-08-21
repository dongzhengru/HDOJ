import java.util.Scanner;

public class HDOJ1005 {
    public static void main(String[] args) {
        int f[]=new int[1000];
        f[1]=1;
        f[2]=1;
        Scanner sc=new Scanner(System.in);
        int A= sc.nextInt();
        int B= sc.nextInt();
        int n=sc.nextInt();
        while(n!=0&&A!=0&&B!=0){
            int i;
            for (i=3;i<=50;i++){
                f[i]=(A*f[i-1]+B*f[i-2])%7;
            }
            System.out.println(f[n%49]);
            A= sc.nextInt();
            B= sc.nextInt();
            n=sc.nextInt();
        }
    }
}
