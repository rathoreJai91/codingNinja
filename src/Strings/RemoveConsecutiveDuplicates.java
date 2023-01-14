package Strings;

public class RemoveConsecutiveDuplicates {

    public static String removeConsecutiveDuplicates(String str) {

        String output="";
        int i=0;
        int j=1;
        while(i<str.length()-1){
            if(str.charAt(i)!=str.charAt(j)){
                output+=str.charAt(i);
            }
            i++;
            j++;
        }
        output+=str.charAt(i);
        return output;
        
    }

    public static void main(String[] args) {
        String str="aabbbcc";
        System.out.println(str);
        System.out.println(removeConsecutiveDuplicates(str));
    }
}
