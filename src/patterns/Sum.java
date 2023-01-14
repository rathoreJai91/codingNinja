package patterns;

import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();

        int i=1;
        while(i<=n){
            int sum=0;
            int j=1;
            while(j<=i){
                if(j!=i){
                    System.out.print(j+"+");
                    sum+=j;
                    j++;
                }else{
                    System.out.print(j+"=");
                    sum+=j;
                    j++;
                }
            }
            System.out.println(sum);
            i++;
        }
        s.close();
    }
}
