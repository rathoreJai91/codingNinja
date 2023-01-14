package Recursion;

public class NoOfDigits {

    public static int count(int n) {
        if(n==0){
            return 0;
        }
        n=n/10;
        int output=1+count(n);
        return output;
    }

    public static void main(String[] args) {
        System.out.println(count(132342));
    }
}
