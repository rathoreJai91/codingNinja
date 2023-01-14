package DataStructures.HashMaps;
import java.util.HashMap;

/*
 * Given a random integer array A of size N. 
 * Find and print the count of pair of elements 
 * in the array which sum up to 0.
 * Note: Array A can contain duplicate elements as well.
 */

public class PairSum {
    public static int pairSum(int[] arr){
        HashMap<Integer, Integer> map = new HashMap<>();
        int count=0;

        for(int i : arr){
            map.put(i,map.getOrDefault(i, 0)+1);
        }
        for(int i : arr){
            if(i<0){
                if(map.containsKey(i*-1)){
                    count+=map.get(i*-1);
                }
            }
        }
        if(map.containsKey(0)){
            int n= map.get(0);
            count+=(n*(n-1))/2;
        }
        return count;
    }
}
