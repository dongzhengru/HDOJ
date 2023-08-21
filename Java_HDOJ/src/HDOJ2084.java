import java.util.Scanner;

public class HDOJ2084 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        while (n-- > 0) {
            int line= sc.nextInt();
            int[][] dp=new int[line][];
            for (int i=0;i<dp.length;i++) {
                dp[i]=new int[i+1];
            }
            for (int i=0;i<dp.length;i++) {
                for (int j=0;j<dp[i].length;j++) {
                    dp[i][j]=sc.nextInt();
                }
            }
            for (int i = line-2; i >= 0; i--) {
                for (int j = 0; j < dp[i].length; j++) {
                    if(dp[i][j]+dp[i+1][j]>dp[i][j]+dp[i+1][j+1]){
                        dp[i][j] += dp[i+1][j];
                    }else {
                        dp[i][j] += dp[i+1][j+1];
                    }
                }
            }
            System.out.println(dp[0][0]);
        }
    }
}