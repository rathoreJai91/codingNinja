package Recursion.Assignment;

public class IsStringPalindrome {

    public static Boolean isStringPaliindrome(String str) {
        if(str.length()<=1){
            return true;
        }
        if(str.charAt(0)!=str.charAt(str.length()-1)){
            return false;
        }
        // String smallStr="";
        // for(int i=1;i<str.length()-1;i++){
        //     smallStr+=str.charAt(i);
        // }
        // boolean check=isStringPaliindrome(smallStr);

        // OR
        
        Boolean check=isStringPaliindrome(str.substring(1, str.length()-1));

        return check;
    }

    public static void main(String[] args) {
        String str="racecar";
        System.out.println(isStringPaliindrome(str));
    }
}
