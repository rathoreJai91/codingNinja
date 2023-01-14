package Algorithms.Sorting;
import Array.ArrayInputOutput;

public class SelectionSort {

    public static void selectionSort(int arr[]){
        
        for(int i=0;i<arr.length-1;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[j]<arr[i]){
                    int temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        
        int arr[]=ArrayInputOutput.takeInput();
        selectionSort(arr);
        ArrayInputOutput.printArray(arr);

    }
}
