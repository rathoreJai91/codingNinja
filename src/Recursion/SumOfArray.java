package Recursion;

public class SumOfArray {

    public static int sum(int[] arr, int si) {
        
        if(si==arr.length-1){
            return arr[si];
        }
        // int[] smallArr=new int[arr.length-1];
        // for(int i=1;i<arr.length;i++){
        //     smallArr[i-1]=arr[i];
        // }
        // int total=arr[0]+sum(smallArr);
        // return total;
        int total=arr[si]+sum(arr, ++si);
        return total;
    }

    
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5};
        int si=0;
        System.out.println(sum(arr,si));
    }
}
