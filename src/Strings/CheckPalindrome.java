package Strings;

public class CheckPalindrome {

    public static boolean checkPalindrome(String str) {
        int i=0,j=str.length()-1;
        while(i<=j){
            if(str.charAt(i)!=str.charAt(j)){
                return false;
            }else{
                i++;
                j--;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String str="naman";
        if(checkPalindrome(str)){
            System.out.println("Palindrome");
        }else{
            System.out.println("not palindrome");
        }
    }
}
