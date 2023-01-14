package fundamentals;
import java.util.Scanner;

public class SumOfEvenAndOdd {
    public static void main(String[] args) {
        
        int num;
        Scanner s= new Scanner(System.in);
        num=s.nextInt();
        int rem,odd=0,even=0;
        while(num>0){
            rem=num%10;
            num/=10;

            if(rem%2==0){
                even+=rem;
            }else{
                odd+=rem;
            }
        }
        System.out.println(even+" "+odd);
        s.close();
    }
}
