package DataStructures.HashMaps;
import java.util.HashMap;

/*
 * You are given an array of integers that contain numbers 
 * in random order. Write a program to find and return the 
 * number which occurs the maximum times in the given input.
 * If two or more elements contend for the maximum frequency, 
 * return the element which occurs in the array first.
 */

public class MaxFrequencyNumber {
    
    public static int maxFrequencyNumber(int[] arr){
        // int maxNum=-1;
        // HashMap<Integer,Integer> map = new HashMap<>();
        // for(int i : arr){
        //     if(maxNum==-1){
        //         maxNum=i;
        //         map.put(i, 1);
        //     }
        //     else{
        //         if(map.containsKey(i)){
        //             int freq=map.get(i);
        //             freq++;
        //             map.put(i, freq);
        //             if(freq>map.get(maxNum)){
        //                 maxNum=i;
        //             }
        //         }else{
        //             map.put(i, 1);
        //         }
        //     }
        // }
        // return maxNum;

        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i : arr){
            if(map.containsKey(i)){
                int freq = map.get(i);
                freq++;
                map.put(i, freq);
            }else{
                map.put(i,1);
            }
        }
        int maxNum=-1;
        for(int i : arr){
            if(maxNum==-1){
                maxNum=i;
            }else{
                if(map.get(i)>map.get(maxNum)){
                    maxNum=i;
                }
            }
        }
        return maxNum;
    }

}
