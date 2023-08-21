import java.util.Scanner;

public class HDOJ1020 {
    private static Scanner scanner;
    public static void main(String[] args) {
        scanner = new Scanner(System.in);
        int n= scanner.nextInt();
        while(n-->0) {
            String string=scanner.next();
            String result="";
            char[] s=string.toCharArray();
            int count=1;
            for (int i=1;i<s.length;i++){
                if(s[i] == s[i-1]){
                    count++;
                }
                else {
                    if (count == 1) {
                        result = result + s[i - 1];
                    }
                    else {
                        result = result + count + s[i - 1];
                    }
                    count = 1;
                }
            }
            if(count == 1){
                result = result+s[s.length-1];
            }else {
                String tmp_count = String.valueOf(count);
                result = result+tmp_count+s[s.length-1];
            }
            System.out.println(result);
        }
    }
}
