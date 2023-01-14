package Recursion.Assignment;


public class FindGeometricSum {

    public static double findGeometricSum(int k) {
        if(k==0){
            return 1;
        }
        double sum=(1/Math.pow(2, k))+findGeometricSum(k-1);
        return sum;
    }

    public static void main(String[] args) {
        System.out.format("%.5f",findGeometricSum(4));
        System.out.println(findGeometricSum(3));
    }
}
