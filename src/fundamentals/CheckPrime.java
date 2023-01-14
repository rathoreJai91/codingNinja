package fundamentals;
import java.util.Scanner;

public class CheckPrime {
    public static void main(String[] args) {
        int num;
        Scanner s=new Scanner(System.in);
        num=s.nextInt();
        int div=2;

        while(div<=num/2){
           if(num%div==0){
                break;
           }else{
                div++;
           }
        }
        if(div==num/2+1){
            System.out.println(num + " is Prime");
        }else{
            System.out.println(num + " is not Prime");
        }
        s.close();
    }
}
