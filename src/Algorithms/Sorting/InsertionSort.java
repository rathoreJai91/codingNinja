package Algorithms.Sorting;
import Array.ArrayInputOutput;

public class InsertionSort {

    public static void insertionSort(int arr[]){
        
        for(int i=1;i<arr.length;i++){
            for(int j=i-1;j>=0;j--){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }else{
                    break;
                }
            }
        }
    }

    public static void main(String[] args) {
        
        int arr[]=ArrayInputOutput.takeInput();
        insertionSort(arr);
        ArrayInputOutput.printArray(arr);
    }
    
}
