package Recursion;

public class MinInArray {
    
    private static void printMinHelper(int[] a, int startIndex , int minSoFar){
        if(startIndex==a.length){
            System.out.println(minSoFar);
            return;
        }
        minSoFar=Math.min(a[startIndex],minSoFar);
        printMinHelper(a, startIndex+1, minSoFar);
    }

    public static void printMin(int[] a){
        printMinHelper(a,0,Integer.MAX_VALUE);
    }

    public static void main(String[] args) {
        int[] a={2,4,2,6,9,5};
        printMin(a);
    }
}
