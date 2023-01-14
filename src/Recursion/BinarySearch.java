package Recursion;

public class BinarySearch {

    private static int binarySearch(int arr[],int st, int end, int x) {

        if(st>end){
            return -1;
        }
        int mid=(st+end)/2;
        if(arr[mid]==x){
            return mid;
        }
        if(arr[mid]<x){
            return binarySearch(arr, mid+1, end, x);
        }else{
            return binarySearch(arr, st, mid-1, x);
        }
    }

    public static void main(String[] args) {
        int[] arr={0,1,2,3,4,5,6,7,8,9};
        int x=10;
        System.out.println(binarySearch(arr,0,arr.length-1,x));

    }
}
