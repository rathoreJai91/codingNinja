package Recursion;

import java.util.ArrayList;

public class Subsequences {

    public static void subSequences(String word , String stringSoFar){
        if(word.length() == 0){
            System.out.println(stringSoFar);
            return;
        }
        String smallOutput = word.substring(1);
        subSequences(smallOutput , stringSoFar);
        subSequences(smallOutput , stringSoFar + word.charAt(0));
    }

    public static ArrayList<String> subsequences(String word){
        
        if(word.length()==0){
            ArrayList<String> sub = new ArrayList<>();
            sub.add("");
            return sub;
        }
        ArrayList<String> sub = subsequences(word.substring(1));
        int n=sub.size();
        for(int i=0;i<n;i++){
            sub.add(word.charAt(0)+sub.get(i));
        }
        return sub;
    }
    public static void main(String[] args) {
        String word="abc";
        ArrayList<String> sub = subsequences(word);
        System.out.println(sub);
        subSequences(word , "");
    }
}
