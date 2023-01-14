package patterns;

import java.util.Scanner;

public class Advanced {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();

        // 1st pattern
        // ****
        // ***
        // **
        // *

        /* 
        int i=1;
        while(i<=n){
            int j=1;
            while(j<=n-i+1){
                System.out.print("*");
                j++;
            }
            System.out.println();
            i++;
        }
        */

        // 2nd pattern 
        // 4444
        // 333
        // 22
        // 1

        /* 
        int i=1;
        while(i<=n){
            int j=1;
            while(j<=n-i+1){
                System.out.print(n-i+1);
                j++;
            }
            System.out.println();
            i++;
        }
        */

        // 3rd pattern
        //     *
        //    **
        //   ***
        //  ****
        // *****

        /* 
        int i=1;
        while(i<=n){
            int spaces=1;
            while(spaces<=n-i){
                System.out.print(" ");
                spaces++;
            }
            int stars=1;
            while(stars<=i){
                System.out.print("*");
                stars++;
            }
            System.out.println();
            i++;
        }
        */

        // 4th pattern
        //    1
        //   12
        //  123
        // 1234

        /* 
        int i=1;
        while(i<=n){
            int spaces=1;
            while(spaces<=n-i){
                System.out.print(" ");
                spaces++;
            }
            int nums=1;
            while(nums<=i){
                System.out.print(nums);
                nums++;
            }
            System.out.println();
            i++;
        }
        */

        // 5th pattern
        //    1
        //   121
        //  12321
        // 1234321

        /* 
        int i=1;
        while(i<=n){
            int spaces=1;
            while(spaces<=n-i){
                System.out.print(" ");
                spaces++;
            }
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
            System.out.println();
            i++;
        }
        */

        // 6th pattern
        //    *
        //   ***
        //  *****
        // *******

        /* 
        int i=1;
        while(i<=n){
            int spaces=1;
            while(spaces<=n-i){
                System.out.print(" ");
                spaces++;
            }
            int stars=1;
            while(stars<=2*i-1){
                System.out.print("*");
                stars++;
            }
            System.out.println();
            i++;
        }
        */

        // 7th pattern
        //     1
        //    232
        //   34543
        //  4567654
        // 567898765

        /* 
        int i=1;
        while(i<=n){
            int spaces=1;
            while(spaces<=n-i){
                System.out.print(" ");
                spaces++;
            }
            int num=1;
            while(num<=i){
                System.out.print(i+num-1);
                num++;
            }
            int j=1;
            int dec=2*(i-1);
            while(j<i){
                System.out.print(dec);
                dec--;
                j++;
            }
            System.out.println();
            i++;
        }
        */

        // 8th pattern
        //     *
        //    ***
        //   *****
        //    ***
        //     *

        int i=1;
        int j=1;
        while(i<=n){
            if(i<=(n+1)/2){
                int spaces=1;
                while(spaces<=((n+1)/2-i)){
                    System.out.print(" ");
                    spaces++;
                }
                int stars=1;
                while(stars<=2*i-1){
                    System.out.print("*");
                    stars++;
                }
                System.out.println();
                i++;
            }
            else{
                
                int spaces=1;
                while(spaces<=j){
                    System.out.print(" ");
                    spaces++;
                }
                int stars=1;
                while(stars<=(2*(n-i)+1)){
                System.out.print("*");
                stars++;
                }
                System.out.println();
                i++;
                j++;
            }
        }
        s.close();
    }
}
