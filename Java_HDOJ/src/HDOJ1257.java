import java.util.Scanner;

public class HDOJ1257 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n;
        while (sc.hasNext()){
            n=sc.nextInt();
            int i,tmp=0,sum=1;
            int[] a=new int[n+1];
            for (i=1;i<=n;i++){
                a[i]= sc.nextInt();
                if (i==1){
                    tmp=a[1];
                }
                else {
                    if (tmp<a[i]){
                        sum++;
                    }
                    tmp=a[i];
                }
            }
            System.out.println(sum);
        }
    }
}
