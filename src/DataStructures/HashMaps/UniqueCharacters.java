package DataStructures.HashMaps;
import java.util.HashMap;

/*
 * Given a string S, you need to remove all the duplicates. 
 * That means, the output string should contain each character 
 * only once. The respective order of characters should remain 
 * same, as in the input string.
 */

public class UniqueCharacters {
    
    public static String uniqueChar(String str){
        HashMap<Character,Integer> map = new HashMap<>();
        String output="";
        for(int i=0;i<str.length();i++){
            if(!map.containsKey(str.charAt(i))){
                output+=str.charAt(i);
                map.put(str.charAt(i), 1);
            }
        }
        return output;
    }
}
