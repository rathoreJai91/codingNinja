package Algorithms.Sorting;

public class HeapSort {
    
    public static void downHeapify(int[] arr, int i , int n){
        int parentIndex=i;
        int leftChildIndex=parentIndex*2+1;
        int rightChildIndex=parentIndex*2+2;

        while(leftChildIndex<n){
            int minIndex=parentIndex;
            if(arr[leftChildIndex]<arr[minIndex]){
                minIndex=leftChildIndex;
            }
            if(rightChildIndex<n && arr[rightChildIndex]<arr[minIndex]){
                minIndex=rightChildIndex;
            }
            if(minIndex==parentIndex){
                return;
            }
            int temp=arr[parentIndex];
            arr[parentIndex] = arr[minIndex];
            arr[minIndex] = temp;
            parentIndex=minIndex;
            leftChildIndex=parentIndex*2+1;
            rightChildIndex=parentIndex*2+2;
        }
    }

    public static void inplaceHeapSort(int[] arr){
        int n=arr.length;

        //Build the heap from array,  will take O(n) time and O(1) space
        for(int i=(n/2)-1;i>=0;i--){
            downHeapify(arr,i,n);
        }

        //delete the first element and put it into its respective position
        for(int i=n-1;i>=0;i--){
            int temp=arr[i];
            arr[i]=arr[0];
            arr[0]=temp;
            downHeapify(arr, 0, i);
        }
    }

    public static void main(String[] args) {
        int [] arr ={4,7,3,2,8,7,6,1};
        inplaceHeapSort(arr);
        for(int i:arr){
            System.out.println(i);
        }
    }
}
