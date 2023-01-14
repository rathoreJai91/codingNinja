package Recursion;

public class power {

    public static int powerof(int x, int n) {
        if(n==0){
            return 1;
        }
        int output=x*powerof(x, n-1);
        return output;
    }

    public static void main(String[] args) {
        System.out.println(powerof(2,5));
    }
}
