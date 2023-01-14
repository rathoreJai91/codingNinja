package forLoop;
import java.util.Scanner;

public class binaryToDecimal {
    public static void main(String[] args) {
        
        try (Scanner s = new Scanner(System.in)) {
            int Bin=s.nextInt();
            int remainder;
            int deci=0;
            int p=0;
            for(;Bin!=0;Bin/=10){
                remainder=Bin%10;
                deci+=(remainder*(int)Math.pow(2,p));
                p++;
            }
            System.out.println(deci);
            s.close();
        }
    }
}
