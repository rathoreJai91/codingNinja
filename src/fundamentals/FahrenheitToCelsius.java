package fundamentals;
import java.util.Scanner;

public class FahrenheitToCelsius {
    public static void main(String[] args) {
        
        int S,E,W;
        Scanner s=new Scanner(System.in);
        S=s.nextInt();
        E=s.nextInt();
        W=s.nextInt();
        
        while (S<=E) {
            int celsius;
            celsius=((S-32)*5)/9;
            System.out.println(S+" "+celsius);
            S+=W;
        }
        s.close();
    }
}
