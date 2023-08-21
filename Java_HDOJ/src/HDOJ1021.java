import java.util.Scanner;

public class HDOJ1021 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=0;
        while(sc.hasNext()){
            n= sc.nextInt();
            if(n%8==2||n%8==6){
                System.out.println("yes");
            }
            else {
                System.out.println("no");
            }
        }
    }
}
