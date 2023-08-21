import javax.security.sasl.SaslClient;
import java.util.Scanner;

public class HDOJ2021 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n,i,sum,n100,n50,n10,n5,n2,n1;
        int[] wages=new int[100];
        while(true){
            n=sc.nextInt();
            if (n == 0) {
                break;
            }
            sum=0;
            for(i=0;i<n;i++){
                wages[i]= sc.nextInt();
                n100=wages[i]/100;
                n50=(wages[i]-100*n100)/50;
                n10=(wages[i]-n100*100-n50*50)/10;
                n5=(wages[i]-n100*100-n50*50-n10*10)/5;
                n2=(wages[i]-n100*100-n50*50-n10*10-n5*5)/2;
                n1=wages[i]-n100*100-n50*50-n10*10-n5*5-n2*2;
                sum+=n100+n50+n10+n5+n2+n1;
            }
            System.out.println(sum);
        }
    }
}
