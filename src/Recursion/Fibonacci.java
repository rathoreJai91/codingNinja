package Recursion;

public class Fibonacci {

    public static int fib(int n) {
        if(n==1 || n==0){
            return n;
        }

        int term=fib(n-1)+fib(n-2);
        return term;
        
    }

    public static void main(String[] args) {
        System.out.println(fib(6));
    }
}
