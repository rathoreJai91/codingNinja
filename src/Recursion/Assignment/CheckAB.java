package Recursion.Assignment;

public class CheckAB {

    public static Boolean checkAB(String str) {
        if(str.length()<=1){
            return true;
        }
        boolean check=false;
        if(str.charAt(0)=='a'){
            if(str.charAt(1)=='a'){
                check=checkAB(str.substring(1));
            }else if(str.charAt(1)=='b' && str.charAt(2)=='b'){
                check=checkAB(str.substring(3));
            }
        }else{
            return false;
        }
        return check;
    }

    public static void main(String[] args) {
        String str="abb";
        System.out.println(checkAB(str));
    }
}
