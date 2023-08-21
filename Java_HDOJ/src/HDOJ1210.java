import java.util.Scanner;

public class HDOJ1210 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            int n = sc.nextInt();
            int weizhi =1;
            int t = 2*n+1;
            int sum=0;
            while(true){
                weizhi = weizhi*2%t;
                sum++;
                if(weizhi == 1){
                    break;
                }
            }
            System.out.println(sum);
        }


    }

}
