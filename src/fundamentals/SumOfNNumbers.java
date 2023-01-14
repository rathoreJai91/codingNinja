package fundamentals;
import java.util.Scanner;

public class SumOfNNumbers {
    public static void main(String [] args){
        int n;
        Scanner s=new Scanner(System.in);
        n=s.nextInt();

        int i=1;
        int sum=0;

        while (i<=n) {
            sum+=i;
            i++;
        }
        System.out.print(sum);
        s.close();
    }
}
