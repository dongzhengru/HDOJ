import java.util.Scanner;

public class HDOJ1003 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num;
        int cases=1;
        int i;
        int n=sc.nextInt();
        while(n>0){
            num=sc.nextInt();
            int[] f=new int[num+2];
            int[] g=new int[num+2];
            f[1]= sc.nextInt();
            g[1]=f[1];
            int max=f[1];
            int max_i=1;
            int max_j=1;
            int tmp_i=1;
            int tmp_j=1;
            for (i=2;i<=num;i++){
                f[i]= sc.nextInt();
                if(g[i-1]+f[i]>=f[i]){
                    g[i]=g[i-1]+f[i];
                    tmp_j=i;
                }
                else{
                    g[i]=f[i];
                    tmp_j=i-1;
                    if (i==num){
                        tmp_i=i;
                        tmp_j=i;
                    }
                }
                if(g[i]>max){
                    max=g[i];
                    max_i=tmp_i;
                    max_j=tmp_j;
                }
                if (g[i-1]+f[i]<f[i]){
                    tmp_i=i;
                    tmp_j=i;
                }
            }
            System.out.println("Case "+cases+":");
            System.out.println(max+" "+max_i+" "+max_j);
            if (n>1){
                System.out.println();
            }
            n--;
            cases++;
        }
    }
}
