import java.util.Scanner;

public class HDOJ1087 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while(true){
            int n= sc.nextInt();
            if (n==0){
                break;
            }
            int i;
            int[] s=new int[n];
            int[] dp=new int[n];
            for (i=0;i<n;i++){
                s[i]= sc.nextInt();
            }
            int ans=0,j;
            dp[0]=s[0];
            for (i=1;i<n;i++){
                dp[i]=s[i];
                for (j=0;j<i;j++){
                    if (s[j]<s[i]){
                        dp[i]=Math.max(dp[i],dp[j]+s[i]);
                    }
                }
            }
            for (i=0;i<n;i++){
                ans=Math.max(ans,dp[i]);
            }
            System.out.println(ans);
        }
    }
}
