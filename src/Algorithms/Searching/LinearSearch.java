package Algorithms.Searching;

import java.util.Scanner;

import Array.ArrayInputOutput;

public class LinearSearch {
    
    public static int linearSearch(int arr[],int x){
        int n=arr.length;
        int pos=-1;
        
        for(int i=0;i<n;i++){
            if(arr[i]==x){
                pos=i;
                break;
            }
        }
        return pos;
    }
    
    public static void main(String[] args) {
        
        int arr[]=ArrayInputOutput.takeInput();
        Scanner s=new Scanner(System.in);
        int x=s.nextInt();
        int pos=linearSearch(arr,x);
        System.out.println(pos);
        s.close();
    }
}
