import java.util.Scanner;

public class HDOJ1215 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int i,j,t,n;
        int[] a=new int[500005];
        a[0]=a[1]=-1;
        t= sc.nextInt();
        for(i=2;i<500005;i++){
            for(j=i+i;j<500005;j+=i){
                a[j]+=i;
            }
        }
        while(t-->0){
            n= sc.nextInt();
            System.out.println(a[n]+1);
        }
    }
}
