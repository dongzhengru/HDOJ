import java.util.Scanner;

public class HDOJ1720 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while(sc.hasNext()){
            String a = sc.next();
            String b = sc.next();
            System.out.println(hexToDec(a)+hexToDec(b));
        }
    }
    public static long hexToDec(String str){
        char hex[] = {'0','1','2','3','4','5','6',
            '7','8' ,'9','a','b','c','d','e','f'};
        long num = 0;
        long k = 1;
        for (int i=str.length()-1;i>=0;i--){
            char c=str.charAt(i);
            for(int j=0;j<hex.length;j++){
                if(c==hex[j]||c==hex[j]-32){
                    num+=j*k;
                    k*=16;
                    break;
                }
            }
        }
        return num;
    }
}