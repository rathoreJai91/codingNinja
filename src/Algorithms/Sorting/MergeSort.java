package Algorithms.Sorting;

public class MergeSort {


    private static void merge(int s1[], int s2[], int arr[]) {
        int i=0,j=0,k=0;
        while(i<s1.length && j<s2.length){
            if(s1[i]<=s2[j]){
                arr[k]=s1[i];
                i++;
                k++;
            }else{
                arr[k]=s2[j];
                j++;
                k++;
            }
        }
        while(i<s1.length){
            arr[k]=s1[i];
            k++;
            i++;
        }
        while(j<s2.length){
            arr[k]=s2[j];
            k++;
            j++;
        }
    }

    private static void mergeSort(int[] arr) {
        if(arr.length<=1){
            return;
        }
        // int start=0;
        // int end=arr.length-1;
        // int mid=(start+end)/2;

        int[] b=new int[arr.length/2];
        int[] c=new int[arr.length-b.length];

        for(int i=0;i<arr.length/2;i++){
            b[i]=arr[i];
        }
        for(int i=arr.length/2;i<arr.length;i++){
            c[i-arr.length/2]=arr[i];
        }
        mergeSort(b);
        mergeSort(c);
        merge(b,c,arr);
    }

    
    public static void main(String[] args) {
        int[] arr={10,4,5,9,8,6,11,13,12};
        mergeSort(arr);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}