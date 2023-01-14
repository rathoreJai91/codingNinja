package Recursion.Assignment;

public class CountZeros {

    private static int countZeros(int input) {
        if(input<10){
            if(input==0){
                return 1;
            }else{return 0;}
        }
        int n=input%10;
        int count=countZeros(input/10);
        if(n==0){
            return count+1;
        }else{
            return count;
        }
    }

    public static void main(String[] args) {
        int input=0;
        System.out.println(countZeros(input));
    }
}
