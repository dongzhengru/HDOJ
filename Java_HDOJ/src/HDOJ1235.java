import java.util.Scanner;

public class HDOJ1235 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while (true){
            int n= sc.nextInt();
            if (n==0){
                break;
            }
            int[] score=new int[n];
            int i;
            for (i=0;i<n;i++){
                score[i]=sc.nextInt();
            }
            int fscore=sc.nextInt();
            int sum=0;
            for (i=0;i<n;i++){
                if (score[i]==fscore){
                    sum++;
                }
            }
            System.out.println(sum);
        }
    }
}
