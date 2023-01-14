package DataStructures.PriorityQueue;

public class CheckMaxHeap {
    
    public static boolean checkMaxHeap(int[] arr){
        
        boolean check=true;
        int pi=0; //pi=parentIndex
        int lci=pi*2+1; //lci=leftChildIndex
        int rci=pi*2+2; //rci=rightChildIndex
        int n=arr.length;
        while(lci<n){
            if(arr[lci]>arr[pi]){
                check=false;
                break;
            }
            if(rci<n && arr[rci]>arr[pi]){
                check=false;
                break;
            }
            pi++;
            lci=pi*2+1;
            rci=pi*2+2;
        }
        return check;
    }

}
