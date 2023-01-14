package Recursion.Assignment;

public class SumOfDigits {

    private static int sumOfDigits(int input) {
        if(input==0){
            return 0;
        }
        int sum=input%10+sumOfDigits(input/10);
        return sum;
    }

    public static void main(String[] args) {
        int input=12345;
        System.out.println(sumOfDigits(input));
    }
}
