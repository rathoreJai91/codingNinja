package Recursion.Assignment;

public class ConvertStringToInt {

    public static int convertStringToInt(String str){
        if(str.length()==1){
            int n=str.charAt(0)-'0';
            return n;
        }

        int n=convertStringToInt(str.substring(0, str.length()-1))*10+str.charAt(str.length()-1)-'0';
        return n;
    }

    public static void main(String[] args) {
        String str="00001231";
        System.out.println(convertStringToInt(str));
    }
}
