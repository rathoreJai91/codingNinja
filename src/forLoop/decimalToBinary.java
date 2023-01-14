package forLoop;

import java.util.Scanner;

public class decimalToBinary {
    
    public static void main(String[] args) {
        
        Scanner s=new Scanner(System.in);
        int deci=s.nextInt();
        
        int binary=0;
        int p=0;
        while (deci != 0) {
            int rem = deci % 2;
            double c = Math.pow(10,p);
            binary+=rem*c;
            deci/= 2;
            p++;
        }
        System.out.println(binary);
        s.close();
    }
}
// Scanner in= new Scanner(System.in);
// 		int num = in.nextInt();
        
// 		int i=1, rem;
//         long  binary=0;
// 		while(num!=0){
// 		    rem = num%2;
//             num/=2;
// 		    binary += i*rem;   
// 		    i=i*10;
// 		}
// 		System.out.println(binary);