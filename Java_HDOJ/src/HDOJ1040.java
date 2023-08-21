import java.util.Scanner;

public class HDOJ1040 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int i,j,tmp;
        while(n-->0){
            int num= sc.nextInt();
            int[] a=new int[num];
            for (i=0;i<num;i++){
                a[i]=sc.nextInt();
            }
            for (i=0;i<num-1;i++){
                for (j=0;j<num-i-1;j++){
                    if (a[j]>a[j+1]){
                        tmp=a[j];
                        a[j]=a[j+1];
                        a[j+1]=tmp;
                    }
                }
            }
            for (i=0;i<num-1;i++){
                System.out.print(a[i]+" ");
            }
            System.out.println(a[num-1]);
        }
    }
}
