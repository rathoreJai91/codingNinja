package Strings;

public class ScontainsT {
    
    /*Given two string s and t, write a function to 
    check if s contains all characters of t (in the 
    same order as they are in string t).
    */

    public static boolean checkSequence(String a, String b) {
        
        int i=0;
        int j=0;
        while(i<a.length()){
            if(a.charAt(i)==b.charAt(j)){
                j++;
                if(j==b.length()){
                    return true;
                }
            }
            i++;
        }
        // if(j==b.length()){
        //     return true;
        // }
        return false;
    }

    public static void main(String[] args) {
        String large="st3h5irteuyarh!";
        String small="shrey";
		System.out.println(checkSequence(large, small));
    }
}
