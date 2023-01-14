package patterns;

import java.util.Scanner;

public class TrianglePattern {
    public static void main(String[]args){
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();

        // 1st pattern
        // 1
        // 12
        // 123
        // 1234

        /*
        int i=1;
        while(i<=n){
            int j=1;
            while(j<=i){
                System.out.print(j);
                j++;
            }
            System.out.println();
            i++;
        }
        */

        // 2nd pattern
        // 1
        // 23
        // 456
        // 78910

        /* 
        int i=1;
        int count=1;

        while(i<=n){
            int j=1;
            while(j<=i){
                System.out.print(count+" ");
                count++;
                j++;
            }
            System.out.println();
            i++;
        }
        */

        // 3rd pattern
        // 1
        // 23
        // 345
        // 4567

        /* 
        int i=1;
        while(i<=n){
            int st=i;
            int j=1;
            while(j<=i){
                System.out.print(st+" ");
                st++;
                j++;
            }
            System.out.println();
            i++;
        }
        */

        // 4th pattern
        // 1
        // 21
        // 321
        // 4321

        int i=1;
        while(i<=n){
            int j=1;
            while(j<=i){
                System.out.print(i-j+1 +" ");
                j++;
            }
            System.out.println();
            i++;
        }
        s.close();
    }
}
