package DataStructures.HashMaps;

import java.util.HashMap;

public class InbulitHashMapUse {
    
    public static void main(String[] args) {
        
        HashMap<String , Integer> map = new HashMap<>();
        
        //Insert
        map.put("abc", 1);
        map.put("def", 3);

        //Presence
        if(map.containsKey("abc")){
            System.out.println("Map has abc");
        }
        if(map.containsKey("def")){
            System.out.println("Map has def");
        }

        //get value
        System.out.println(map.get("def"));

        //remove
        map.remove("abc");
    }

}
