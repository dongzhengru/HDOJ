import java.util.Scanner;

public class HDOJ2551{
    public static void main(String[] args) {
        int ans[] = new int[252];
        for (int i = 1; i < ans.length; i++) {
            ans[i] = ans[i-1]+i*i*i;
        }
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int x=sc.nextInt();
            int i=0;
            for (;i<ans.length;i++) {
                if (x<=ans[i]){
                    break;
                }
            }
            System.out.println(i);
        }
    }
}
