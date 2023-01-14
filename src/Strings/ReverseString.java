package Strings;

public class ReverseString {

    public static String reverseString(String str) {
        
        // String Reverse="";
        // for(int i=str.length()-1;i>=0;i--){
        //     Reverse+=str.charAt(i);
        // }

        String Reverse="";
        for(int i=0;i<str.length();i++){
            Reverse=str.charAt(i)+Reverse;
        }
        return Reverse;
    }

    public static void main(String[] args) {
        String str="WoW";
        String reversestring=reverseString(str);
        //System.out.println(reversestring);

        if(str.equals(reversestring)){
            System.out.println("palindrome");
        }else{
            System.out.println("not palindrome");
        }
    }
}
