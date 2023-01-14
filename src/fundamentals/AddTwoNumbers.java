package fundamentals;
import java.util.Scanner;

public class AddTwoNumbers {
    public static void main(String[] args) {
    
        int m1,m2,m3;

        try (Scanner s = new Scanner(System.in)) {
            String str=s.next();
            char name=str.charAt(0);
            m1=s.nextInt();
            m2=s.nextInt();
            m3=s.nextInt();

            int avg=(m1+m2+m3)/3; 
            System.out.println(name);
            System.out.println(avg);
        }

    }
}
