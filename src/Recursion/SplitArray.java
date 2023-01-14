package Recursion;

public class SplitArray {

    public static boolean helper(int[] arr, int n,int start, int leftSum, int rightSum) {
        
        if(start==n){
            return leftSum==rightSum;
        }
        if(arr[start]%5==0){
            leftSum+=arr[start];
        }else if(arr[start]%3==0){
            rightSum+=arr[start];
        }else{
            return helper(arr,n,start+1,leftSum+arr[start],rightSum) || helper(arr,n,start+1,leftSum,rightSum+arr[start]);
        }
        return helper(arr,n,start+1,leftSum,rightSum);
    }

    public static boolean splitArray(int[] input) {
        
        if(input.length<=1){
            return false;
        }
        return helper(input,input.length,0,0,0);
    }

    public static void main(String[] args) {
        int input[]={};
        System.out.println(splitArray(input));
    }
}
