package DataStructures.PriorityQueue;

import java.util.ArrayList;
import java.util.Collections;
import java.util.PriorityQueue;

/*
 * You are given with an integer k and an array 
 * of integers that contain numbers in random order. 
 * Write a program to find k smallest numbers from 
 * given array. You need to save them in an array 
 * and return it.Time complexity should be O(n * logk) 
 * and space complexity should not be more than O(k).
 */

public class kSmallestElements {
    
    public static ArrayList<Integer> kSmallest(int n, int[] input, int k) {
		// Write your code here
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        for(int i=0;i<k;i++){
            pq.add(input[i]);
        }
        for(int i=k;i<n;i++){
            if(input[i]<pq.peek()){
                pq.remove();
                pq.add(input[i]);
            }
        }
        ArrayList<Integer> result = new ArrayList<>();
        while(!pq.isEmpty()){
            result.add(pq.poll());
        }
        return result;
	}
}
