package forLoop;

import java.util.Scanner;

public class TermsOfAP {
    public static void main(String[] args) {
        
        Scanner s=new Scanner(System.in);
        int N=s.nextInt();

        int i=1;
        int count=1;
        while(count<=N){
            int num=3*i+2;
            if(num%4==0){
                i++;
                continue;
            }else{
                System.out.print(num+" ");
                count++;
                i++;
            }
        } 
        s.close();
    }
}
