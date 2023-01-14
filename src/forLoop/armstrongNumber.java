package forLoop;

import java.util.Scanner;

public class armstrongNumber {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();

        int i=1;
        int digits=0;
        int temp1=n;
        while(temp1!=0){
            temp1/=10;
            i++;
            digits++;
        }
        System.out.println(i);
        int remainder;
        int arm=0;
        int temp2=n;
        while(temp2!=0){
            remainder=temp2%10;
            arm+=Math.pow(remainder,digits);
            temp2/=10;
        }
        if(arm==n){
            System.out.println(true);
        }else{
            System.out.println(false);
        }
        s.close();
    }
}
