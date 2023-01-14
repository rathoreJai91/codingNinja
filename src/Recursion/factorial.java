package Recursion;

public class factorial {

    public static int fact(int n) {
        if(n==1){
            return 1;
        }
        int output=n*fact(n-1);
        return output;
    }
    private static void fact2Helper(int n,int answer){
        if(n==0){
            System.out.println(answer);
            return;
        }
        answer*=n;
        fact2Helper(n-1,answer);
    }

    public static void fact2(int n){
        fact2Helper(n,1);
    }

    public static void main(String[] args) {
        System.out.println(fact(5));
        fact2(5);
    }
}
