import java.util.Scanner;

public class HDOJ2015 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while (true){
            int n=sc.nextInt();
            int m=sc.nextInt();
            int[] s=new int[n];
            int[] res=new int[m];
            s[0]=2;
            int i,m_i=0,num=0;
            for (i=1;i<n;i++){
                s[i]=(i+1)*2;
            }

            for (i=0;i<n;i++){
                res[m_i]+=s[i];
                num++;
                if (num==m){
                    num=0;
                    res[m_i]/=m;
                    m_i++;
                }
            }
            System.out.print(res[0]);
            for (i=1;i<m;i++){
                System.out.print(" "+res[i]);
            }
            System.out.println();
        }
    }
}
