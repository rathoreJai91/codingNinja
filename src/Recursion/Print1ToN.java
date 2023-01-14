package Recursion;

public class Print1ToN {

    public static void nNum(int n) {
        
        if(n==0){
            return;
        }
        nNum(n-1);
        System.out.print(n+" ");
        return;
    }

    public static void main(String[] args) {
        nNum(5);
    }
}
