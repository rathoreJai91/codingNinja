package patterns;

import java.util.Scanner;

public class OddSquare {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();

        int i = 1,j;
        while(i<=n){
            int num = 2*i-1;
            j=n;
            while(j>=i){
                System.out.print(num);
                num+=2;
                j--;
            }
            j = 1;
            int  p =1;
            while(j<=i-1){
                
                System.out.print(p);
                p+=2;
                j++;
            }
            System.out.println();
            i++;
        }
        s.close();
    }
}

