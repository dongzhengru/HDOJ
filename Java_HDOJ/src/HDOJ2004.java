import java.util.Scanner;

public class HDOJ2004 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int score;
        while(sc.hasNext()){
            score=sc.nextInt();
            if(score>=0 && score<=59){
                System.out.println("E");
            }
            else if(score>=60 && score<=69){
                System.out.println("D");
            }
            else if(score>=70 && score<=79){
                System.out.println("C");
            }
            else if(score>=80 && score<=89){
                System.out.println("B");
            }
            else if(score>=90 && score<=100){
                System.out.println("A");
            }
            else{
                System.out.println("Score is error!");
            }
        }
    }
}
