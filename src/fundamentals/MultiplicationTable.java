package fundamentals;
import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        
        int n;
        Scanner s= new Scanner(System.in);
        n=s.nextInt();
        int i=1;
        while(i<=10){
            int m=i*n;
            System.out.println(m);
            i++;
        }
        s.close();
    }
}
