package Recursion;

public class RemoveX {

    private static String removeX(String str) {
        if(str.length()==0){
            return str;
        }
        String smallStr=removeX(str.substring(1));
        if(str.charAt(0)=='x'){
            return smallStr;
        }
        return str.charAt(0)+smallStr;
    }

    public static void main(String[] args) {
        String str="xaxb";
        System.out.println(removeX(str));
    }
}
