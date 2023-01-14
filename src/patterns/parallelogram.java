package patterns;

import java.util.Scanner;

public class parallelogram {
    
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
    
        int i=1;
        while(i<=n){
            int spaces=1;
            while(spaces<i){
                System.out.print(" ");
                spaces++;
            }
            int stars=1;
            while(stars<=n){
                System.out.print("*");
                stars++;
            }
            System.out.println();
            i++;
        } 
        s.close();
    }
    
}
