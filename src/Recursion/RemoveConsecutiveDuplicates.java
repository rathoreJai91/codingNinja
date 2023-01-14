package Recursion;

public class RemoveConsecutiveDuplicates {

    private static String removeConsecutiveDuplicates(String str) {
        
        if(str.length()==1){
            return str;
        }
        String smallStr=removeConsecutiveDuplicates(str.substring(1));
        if(str.charAt(0)==smallStr.charAt(0)){
            return smallStr;
        }else{
            return str.charAt(0)+smallStr;
        }

    }

    public static void main(String[] args) {
        String str="aabccba";
        System.out.println(removeConsecutiveDuplicates(str));
    }
}
