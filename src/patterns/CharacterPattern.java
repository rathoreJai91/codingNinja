package patterns;

import java.util.Scanner;

public class CharacterPattern {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();

        // 1st pattern
        // ABCD
        // ABCD
        // ABCD
        // ABCD

        /* 
        int i=1;
        while(i<=n){
            int j=1;
            while(j<=n){
                char ch=(char)('A'+j-1);
                System.out.print(ch);
                j++;
            }
            System.out.println();
            i++;
        }
        */

        // 2nd pattern
        // A
        // BB
        // CCC
        // DDDD

        /* 
        int i=1;
        while(i<=n){
            int j=1;
            char ch=(char)('A'+i-1);
            while(j<=i){
                System.out.print(ch);
                j++;
            }
            System.out.println();
            i++;
        }
        */

        // 3rd pattern
        // ABCD
        // BCDE
        // CDEF
        // DEFG

        /* 
        int i=1;
        while(i<=n){
            int j=1;
            char ch=(char)('A'+i-1);
            while(j<=n){
                System.out.print(ch +" ");
                j++;
                ch=(char)(ch+1);
            }
            System.out.println();
            i++;
        }
        */

        // 4th pattern
        // A
        // BC
        // CDE
        // DEFG

        /* 
        int i=1;
        while(i<=n){
            int j=1;
            char ch=(char)('A'+i-1);
            while(j<=i){
                System.out.print(ch);
                ch=(char)(ch+1);
                j++;
            }
            System.out.println();
            i++;
        }
        */

        // 5th pattern
        // E
        // DE
        // CDE
        // BCDE
        // ABCDE


        int i=1;
        while(i<=n){
            int j=1;
            char ch=(char)('A'+n-i);
            
            while(j<=i){
                System.out.print(ch);
                ch=(char)(ch+1);
                j++;
            }
            System.out.println();
            i++;
        }
        s.close();
    }
}
