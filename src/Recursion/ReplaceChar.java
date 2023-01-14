package Recursion;

public class ReplaceChar {

    private static String replaceChar(String str, char a, char b) {
        if(str.length()==0){
            return str;
        }
        String smallOutput=replaceChar(str.substring(1), a, b);
        if(str.charAt(0)==a){
            return b+smallOutput;
        }
        return str.charAt(0)+smallOutput;
    }

    public static void main(String[] args) {
        String str="aabbaabb";
        System.out.println(replaceChar(str,'a', 'b'));
    }
}
