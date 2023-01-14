package DataStructures.HashMaps;
import java.util.ArrayList;
import java.util.HashMap;

/*
 * You are given an array of unique integers that contain numbers in random order. 
 * You have to find the longest possible sequence of consecutive numbers using the 
 * numbers from given array.
 * You need to return the output array which contains starting and ending element. 
 * If the length of the longest possible sequence is one, then the output array must 
 * contain only single element.
 * 
 * Note:
 * 1. Best solution takes O(n) time.
 * 2. If two sequences are of equal length, then return the sequence starting with 
 * the number whose occurrence is earlier in the array.
 */

public class LongestConsecutiveSequence {
    
    public static ArrayList<Integer> longestConsecutiveIncreasingSequence(int[] arr){
        HashMap<Integer,Boolean> map = new HashMap<>();
        int maxCount=0,maxStart=0,maxEnd=0;
        for(int i : arr){
            map.put(i, true);
        }
        for(int i : arr){
            int currCount=0,currStart=i,currEnd=0,temp=i;
            while(map.containsKey(temp)){
                currCount++;
                currEnd=temp;
                temp++;
            }
            if(currCount>maxCount){
                maxCount=currCount;
                maxStart=currStart;
                maxEnd=currEnd;
            }
        }
        ArrayList<Integer> ans = new ArrayList<>();
        ans.add(maxStart);
        ans.add(maxEnd);
        return ans;
    }

}
