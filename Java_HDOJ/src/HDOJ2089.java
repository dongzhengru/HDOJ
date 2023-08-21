import java.util.Scanner;

public class HDOJ2089 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        boolean[] a=new boolean[1000000];
        for (int i=1;i<a.length;i++) {
            int k=i;
            while (k>0){
                if(k%10==4){
                    a[i]=true;
                    break;
                }
                if(k%100==62){
                    a[i]=true;
                    break;
                }
                k=k/10;
            }
        }
        while(sc.hasNext()){
            int n=sc.nextInt();
            int m=sc.nextInt();
            if (n==0&&m==0) {
                break;
            }
            int count=0;
            for (int i=n;i<=m;i++) {
                if(a[i]){
                    count++;
                }
            }
            System.out.println(m-n-count+1);
        }
    }
}