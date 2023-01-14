package forLoop;

import java.util.Scanner;

public class primeNumbers {
    
    public static void main(String[] args) {
        
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();

        for(int i=2;i<=n;i++){
            for(int j=2;j<=i;j++){
                if(j==i){
                    System.out.println(i);
                }else if(i%j==0){
                    break;
                }
                
            }
        }
        s.close();
    }
}
