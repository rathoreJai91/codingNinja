package Recursion;

public class ReplacePi {

    private static String replacePi(String str) {
        
        if(str.length()<=1){
            return str;
        }
        if(str.charAt(0)=='p' && str.charAt(1)=='i'){
            String smallStr=replacePi(str.substring(2));
            return "3.14"+smallStr;
        }else{
            String smallStr=replacePi(str.substring(1));
            return str.charAt(0)+smallStr;
        }
    }

    public static void main(String[] args) {
        String str="piabcdpiaspisdp";
        System.out.println(replacePi(str));
    }
}
