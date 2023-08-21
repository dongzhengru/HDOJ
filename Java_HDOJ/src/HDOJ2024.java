import java.util.Scanner;

public class HDOJ2024{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            String str = sc.nextLine();
            int n = Integer.parseInt(str);
            while(n-->0){
                str = sc.nextLine();
                char[] ch = str.toCharArray();
                if(!('a'<=ch[0]&&ch[0]<='z'||'A'<=ch[0]&&ch[0]<='Z'||ch[0]=='_')){
                    System.out.println("no");
                }
                else {
                    for (int i = 1; i < ch.length; i++) {
                        if(!('a'<=ch[i]&&ch[i]<='z'||'A'<=ch[i]&&ch[i]<='Z'||ch[i]=='_'||ch[i]>='0'&&ch[i]<='9')){
                            System.out.println("no");
                            break;
                        }
                        if(i==ch.length-1){
                            System.out.println("yes");
                        }
                    }
                }
            }
        }
    }
}