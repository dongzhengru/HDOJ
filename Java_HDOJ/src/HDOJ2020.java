import java.util.Scanner;

public class HDOJ2020 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while (true) {
            int n= sc.nextInt();
            if (n == 0) {
                break;
            }
            int i,j,tmp;
            int[] s=new int[n];
            for (i=0;i<n;i++){
                s[i]=sc.nextInt();
            }
            for (i=1;i<n;i++){
                for (j=0;j<n-i;j++){
                    if (jdz(s[j])<jdz(s[j+1])){
                        tmp=s[j];
                        s[j]=s[j+1];
                        s[j+1]=tmp;
                    }
                }
            }
            System.out.print(s[0]);
            for (i=1;i<n;i++){
                System.out.print(" "+s[i]);
            }
            System.out.println();
        }
    }
    public static int jdz(int n){
        if (n>=0){
            return n;
        }
        else {
            return -n;
        }
    }
}
