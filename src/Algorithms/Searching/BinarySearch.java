package Algorithms.Searching;
import Array.ArrayInputOutput;
import java.util.Scanner;

public class BinarySearch {

    public static int binarySearch(int arr[],int x){
        
        int pos=-1;
        int start=0,end=arr.length-1;
        while(start<=end){
            int mid=(start+end)/2;
            if(arr[mid]==x){
                pos=mid;
                break;
            }else if(x<arr[mid]){
                end=mid-1;
            }else{
                start=mid+1;
            }
        }
        return pos;
    }

    public static void main(String[] args) {
        int arr[]=ArrayInputOutput.takeInput();
        Scanner s=new Scanner(System.in);
        int x=s.nextInt();

        int pos=binarySearch(arr,x);
        System.out.println(pos);
        s.close();
    }   
}
