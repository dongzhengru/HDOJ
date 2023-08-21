import java.util.Scanner;

public class HDOJ1228{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String[] num = {"zero","one","two","three","four",
                "five","six","seven","eight","nine"};
        while(sc.hasNext()){
            String str = sc.nextLine();
            String[] strs = str.split(" ");
            if ("zero".equals(strs[0])&&"zero".equals(strs[2])) {
                break;
            }
            int a = 0;
            int b = 0;
            boolean isFirstNum = true;
            for (int i=0;i<strs.length;i++) {
                if (strs[i].equals("+")||strs[i].equals("=")) {
                    isFirstNum = false;
                    continue;
                }
                for (int j = 0; j < num.length; j++) {
                    if (strs[i].equals(num[j])) {
                        if (isFirstNum) {
                            a=a*10+j;
                        }
                        else{
                            b=b*10+j;
                        }
                    }
                }
            }
            System.out.println(a+b);
        }
    }
}