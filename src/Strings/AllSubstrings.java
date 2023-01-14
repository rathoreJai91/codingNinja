package Strings;

public class AllSubstrings {

    public static void subStrings(String str){

        // for(int i=0;i<str.length();i++){
        //     String sub="";
        //     for(int j=i;j<str.length();j++){
        //         sub+=str.charAt(j);
        //         System.out.println(sub);
        //     }
        // }


        //to print all the sub strings according to there length

        for(int len=1;len<=str.length();len++){
            for(int start=0;start<=str.length()-len;start++){
                int end=start+len-1;
                System.out.println(str.substring(start, end+1));
            }
        }

    }

    public static void main(String[] args) {
        String str="abcd";
        subStrings(str);

    }
}
