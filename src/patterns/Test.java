package patterns;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();

        for(int i=1;i<=n;i++){
            for(int j=n;j>0;j--){
                if(j==i){
                    System.out.print("*");
                }else{
                    System.out.print(j);
                }
            }
            System.out.println();
        }
        // int i=1;
        // while(i<=n){
        //     int j=n;
        //     while(j>0){
        //         if(j==i){
        //             System.out.print("*");
        //         }else{
        //             System.out.print(j);
        //         }
        //         j--;
        //     }
        //     System.out.println();
        //     i++;
        // }
        s.close();
    }
}
