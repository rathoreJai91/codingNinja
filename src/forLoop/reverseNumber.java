package forLoop;

import java.util.Scanner;

public class reverseNumber {
    public static void main(String[] args) {
        
        Scanner s=new Scanner(System.in);
        int Num=s.nextInt();

        int remainder;
        int rev=0;
        while(Num!=0){
            remainder=Num%10;
            rev=rev*10+remainder;
            Num=Num/10;
        }
        System.out.println(rev);
        s.close();
    }
}
