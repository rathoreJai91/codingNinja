package DataStructures.HashMaps;
import java.util.HashMap;

/*
 * You have been given two integer arrays/lists (ARR1 and ARR2) 
 * of size N and M, respectively. You need to print their intersection; 
 * An intersection for this problem can be defined when both the 
 * arrays/lists contain a particular value or to put it in other words, 
 * when there is a common value that exists in both the arrays/lists.
 * Note :
 * Input arrays/lists can contain duplicate elements.
 * The intersection elements printed would be in the 
 * order they appear in the second array/list (ARR2).
 */

public class PrintIntersection {
    public static void printIntersection(int[] arr1 , int[] arr2){
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i : arr1){
            map.put(i,map.getOrDefault(i, 0)+1);
        }
        for(int i : arr2){
            if(map.containsKey(i)){
                if(map.get(i)>0){
                    System.out.println(i);
                    map.put(i,map.get(i)-1);
                }
            }
        }
    }
}
