import java.util.Scanner;

public class HDOJ2072 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while(sc.hasNext()){
            String f=sc.nextLine();
            if (f.equals("#")) {
                break;
            }
            String str[]=f.split(" ");
            int count = 0;
            for (int i = 0; i < str.length; i++) {
                boolean flag = true;
                if (str[i].equals("")) {
                    continue;
                }
                for (int j=i+1;j<str.length;j++) {
                    if (str[i].equals(str[j])) {
                        flag = false;
                    }
                }
                if (flag){
                    count++;
                }
            }
            System.out.println(count);
        }
    }
}