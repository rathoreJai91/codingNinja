package DataStructures.HashMaps;
import java.util.HashMap;

/*
 * You are given with an array of integers and an integer K. 
 * You have to find and print the count of all such pairs 
 * which have difference K.
 * Note: Take absolute difference between the elements of the array.
 */

public class PairWithDiffK {
    
    public static int getPairsWithDifferenceK(int[] arr , int k){
        HashMap<Integer,Integer> map =new HashMap<>();
        int count=0;

        for(int i : arr){
            if(k==0 && map.containsKey(i)){
                count+=map.get(i);
            }else{
                if(map.containsKey(i-k)){
                    count+=map.get(i-k);
                }
                if(map.containsKey(i+k)){
                    count+=map.get(i+k);
                }   
            }
            map.put(i,map.getOrDefault(i, 0)+1);
        }
        return count;
    }

}
