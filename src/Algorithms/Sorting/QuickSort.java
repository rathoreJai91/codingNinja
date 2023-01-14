package Algorithms.Sorting;

import java.util.ArrayList;
import java.util.List;

public class QuickSort {

    private static int partition(int[] arr,int s,int e) {
        int pivot=arr[s];
        int count=0;
        for(int i=s+1;i<=e;i++){
            if(arr[i]<=pivot){
                count++;
            }
        }
        int pivotIndex=s+count;
        int temp=arr[s];
        arr[s]=arr[pivotIndex];
        arr[pivotIndex]=temp;

        int i=s;
        int j=e;
        while(i<pivotIndex && j>pivotIndex){
            while(arr[i]<=pivot){
                i++;
            }
            while(arr[j]>pivot){
                j--;
            }
            if(i<pivotIndex && j>pivotIndex){
                int swap=arr[i];
                arr[i]=arr[j];
                arr[j]=swap;
            }
        }
        return pivotIndex;
    }

    private static void quickSort(int[] arr,int s,int e) {
        
        if(s>=e){
            return;
        }
        int pivot=partition(arr,s,e);
        quickSort(arr, s, pivot-1);
        quickSort(arr, pivot+1, e);

    }

    public static int partition(List<Integer> arr, int s, int e){
        int pivot=arr.get(s);
        int count=0;
        for(int i=s+1;i<=e;i++){
            if(arr.get(i)<pivot){
                count++;
            }
        }
        int pivotIndex=s+count;
        int temp = arr.get(s);
        arr.set(s,arr.get(pivotIndex));
        arr.set(pivotIndex,temp);
        
        int i=s,j=e;
        while(i<pivotIndex && j>pivotIndex){
            while(arr.get(i)<=pivot){
                i++;
            }
            while(arr.get(j)>pivot){
                j--;
            }
            if(i<pivotIndex && j>pivotIndex){
                int swap = arr.get(i);
                arr.set(i,arr.get(j));
                arr.set(j,swap);
            }
        }
        return pivotIndex;
    }
    
    public static void sort(List<Integer> arr, int s , int e){
        if(s>=e){
            return;
        }
        int pivotIndex=partition(arr,s,e);
        sort(arr,s,pivotIndex-1);
        sort(arr,pivotIndex+1,e);
    }
    
    public static List<Integer> quickSort(List<Integer> arr) {
    // Write your code here
        sort(arr,0,arr.size()-1);
        return arr;
    }
    

    public static void main(String[] args) {
        int arr[]={10,4,5,9,8,6,11,13,12};
        List<Integer> arr2 = new ArrayList<>();
        arr2.add(10);
        arr2.add(4);
        arr2.add(5);
        arr2.add(9);
        arr2.add(8);
        arr2.add(6);
        arr2.add(11);

        quickSort(arr2);

        quickSort(arr,0,arr.length-1);
        // for(int i=0;i<arr2.size();i++){
        //     System.out.print(arr2.get(i)+" ");
        // }
        for(int i : arr2){
            System.out.println(i+" ");
        }
    }
}
