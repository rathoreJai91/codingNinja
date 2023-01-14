package fundamentals;
import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args) {
        
        Scanner s=new Scanner(System.in);
        int a=s.nextInt();
        int rem=a%2;
       // boolean result=rem==0;

        if(rem==0){
            System.out.println(a+" is Even");
        }
        else{
            System.out.println(a+" is Odd");
        }
        s.close();
    }
}
