package fundamentals;
import java.util.Scanner;

public class Power {
    public static void main(String[] args) {
        
        Scanner s=new Scanner(System.in);
        int num=s.nextInt();
        int pow=s.nextInt();
        int result=1;
        int i=1;
        while(i<=pow){
            result=result*num;
            i++;
        }
        System.out.println(result);
        s.close();
    }
}
