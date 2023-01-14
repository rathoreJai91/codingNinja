package Recursion.Assignment;

//Given a string S, compute recursively a new 
//string where identical chars that are adjacent
// in the original string are separated from each
// other by a "*".

public class AddStars {

    public static String addStars(String str) {
        if(str.length()==1){
            return str;
        }
        String smallStr=addStars(str.substring(1));
        if(str.charAt(0)==smallStr.charAt(0)){
            return str.charAt(0)+"*"+smallStr;
        }else{
            return str.charAt(0)+smallStr;
        }
    }

    public static void main(String[] args) {
        String str="aaaa";
        System.out.println(addStars(str));
    }
}
