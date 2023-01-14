package patterns;

import java.util.Scanner;

public class Diamond {
        // *
        // *1*
        // *121*
        // *12321*
        // *1234321*
        // *123454321*
        // *1234321*
        // *12321*
        // *121*
        // *1*
        // *

    public static void main(String[] args) {
        
       Scanner s=new Scanner(System.in);
        int n=s.nextInt();

        System.out.println("*");
        int i=1;
        while(i<=n){
            System.out.print("*");
            int nums=1;
            while(nums<=i){
                System.out.print(nums);
                nums++;
            }
            int k=1;
            while(k<i){
                System.out.print(i-k);
                k++;
            }
            System.out.println("*");
            i++;
        }

        int j=1;
        while(j<n){
            System.out.print("*");
            int nums=1;
            while(nums<=n-j){
                System.out.print(nums);
                nums++;
            }
            int k=1;
            while(k<n-j){
                System.out.print(n-j-k);
                k++;
            }
            System.out.println("*");
            j++;
        }
        System.out.print("*");
        s.close();
    } 
}
