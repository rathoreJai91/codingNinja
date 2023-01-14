package patterns;

import java.util.Scanner;

public class square {
    public static void main(String[] args){

        Scanner s=new Scanner(System.in);
        int n=s.nextInt();


        //1st pattern
         
        // ****
        // ****
        // ****
        // ****


        // int i=0;
        // while(i<n){
        //     int j=0;
        //     while(j<n){
        //         System.out.print("* ");
        //         j++;
        //     }
        //     System.out.println();
        //     i++;
        // }
        


        //2nd pattern
        
        // 1111
        // 2222
        // 3333
        // 4444

        // int i=1;
        // while(i<=n){
        //     int j=1;
        //     while(j<=n){
        //         System.out.print(i+" ");
        //         j++;
        //     }
        //     System.out.println();
        //     i++;
        // }

        // 3rd pattern

        // 1234
        // 1234
        // 1234
        // 1234

        // int i=1;
        // while(i<=n){
        //     int j=1;
        //     while(j<=n){
        //         System.out.print(j+" ");
        //         j++;
        //     }
        //     System.out.println();
        //     i++;
        // }

        // 4th pattern
        // 4321
        // 4321
        // 4321
        // 4321

        int i=1;
        while(i<=n){
            int j=n;
            while(j>0){
                System.out.print(j+" ");
                j--;
            }
            System.out.println();
            i++;
        }
        s.close();
    }
}
