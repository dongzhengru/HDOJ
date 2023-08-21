import java.util.Scanner;

public class HDOJ1009 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int i,j,M,N;
        while (true){
            M=sc.nextInt();
            N=sc.nextInt();
            if (M==-1){
                break;
            }
            double J[] = new double[N];
            double F[] = new double[N];
            double H[] = new double[N];
            for (i=0;i<N;i++){
                J[i] = sc.nextInt();
                F[i] = sc.nextInt();
                H[i] = J[i] / F[i];
            }
            for (i = 0; i < N; i++) {
                for (j = 0; j < N - 1; j++) {
                    if (H[j] < H[j + 1]) {
                        jh(J, j, j + 1);
                        jh(F, j, j + 1);
                        jh(H, j, j + 1);
                    }
                }
            }
            i=0;
            double sum=0;
            while (i<N&&M>0){
                if (F[i] <= M){
                    sum+=J[i];
                    M-=F[i];
                }
                else {
                    sum+=H[i]*M;
                    break;
                }
                i++;
            }
            System.out.printf("%.3f",sum);
            System.out.println();
        }
    }
    public static void jh(double arr[], int i, int j) {
        double temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
