import java.util.Arrays;
import java.util.Scanner;

public class HDOJ2034 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=-1,m=-1,i,j,sum=0;
        boolean flag;
        while(sc.hasNext()){
            n=sc.nextInt();
            m=sc.nextInt();
            if (n==0&&m==0){
                break;
            }
            int[] num=new int[n+m];
            int[] res=new int[n];
            for (i=0;i<n+m;i++){
                num[i]=sc.nextInt();
            }
            sum=0;
            for (i=0;i<n;i++){
                flag=true;
                for (j=n;j<n+m;j++){
                    if (num[i]==num[j]){
                        flag=false;
                        break;
                    }
                }
                if (flag==true){
                    res[sum]=num[i];
                    sum++;
                }
            }
            if (sum==0){
                System.out.println("NULL");
            }
            else {
                Arrays.sort(res,0,sum);
                for (j=0;j<sum;j++){
                    System.out.print(res[j]+" ");
                }
                System.out.println();
            }
        }
    }
}