package forLoop;

import java.util.Scanner;

public class fibonacciSeries {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();

        int first=0;
        int second=1;
        if(n==1){
            System.out.println(first);
        }else if(n==2){
            System.out.println(second);
        }else{
            int sum=0;
            for(int i=3;i<=n;i++){
                sum=first+second;
                first=second;
                second=sum;
            }
            System.out.println(sum);
        }    
        s.close();
    }
}
