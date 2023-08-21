import java.util.Scanner;

public class HDOJ2629 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        while(n-->0){
            String s= sc.next();
            String area=s.substring(0,2);
            String year=s.substring(6,10);
            String month=s.substring(10,12);
            String day=s.substring(12,14);
            if(area.equals("33")) area="Zhejiang";
            if(area.equals("82")) area="Macao";
            if(area.equals("11")) area="Beijing";
            if(area.equals("54")) area="Tibet";
            if(area.equals("71")) area="Taiwan";
            if(area.equals("21")) area="Liaoning";
            if(area.equals("81")) area="Hong Kong";
            if(area.equals("31")) area="Shanghai";
            System.out.println("He/She is from "+area+",and his/her birthday is on "
                    +month+","+day+","+year+" based on the table.");
        }
    }
}