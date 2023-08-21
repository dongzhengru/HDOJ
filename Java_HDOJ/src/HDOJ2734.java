import java.util.Scanner;

public class HDOJ2734 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        char[] example={' ','A','B','C','D','E','F','G',
                'H','I','J','K','L','M','N','O','P','Q',
                'R','S','T','U','V','W','X','Y','Z'};
        int sum;
        while(sc.hasNext()){
            sum=0;
            String text=sc.nextLine();
            if (text=="#"){
                break;
            }
            char f[]=text.toCharArray();
            for(int i=0;i<f.length;i++){
                for (int j=0;j<example.length;j++){
                    if (f[i]==example[j]){
                        sum+=(i+1)*j;
                    }
                }
            }
            System.out.println(sum);
        }
    }

}