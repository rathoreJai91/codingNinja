package DataStructures.HashMaps;

import java.util.ArrayList;
import java.util.HashMap;

public class RemoveDuplicates {
    
    public static ArrayList<Integer> removeDuplicates(int[] arr){

        ArrayList<Integer> output = new ArrayList<>();
        HashMap<Integer, Boolean> map = new HashMap<>();

        for(int i : arr){
            if(map.containsKey(i)){
                continue;
            }
            output.add(i);
            map.put(i, true);
        }
        return output;
    }

}
