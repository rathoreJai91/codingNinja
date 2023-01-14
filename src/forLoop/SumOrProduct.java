package forLoop;

import java.util.Scanner;

public class SumOrProduct {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int N=s.nextInt();
        int C=s.nextInt();

        if(C==1){
            int sum=0;
            for(int i=1;i<=N;i++){
                sum+=i;
            }
            System.out.println(sum);
        }else if(C==2){
            int product=1;
            for(int i=1;i<=N;i++){
                product*=i;
            }
            System.out.println(product);
        }else{
            System.out.println(-1);
        }   
        s.close();
    }    
}
