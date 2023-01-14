package Strings;

import java.util.Scanner;

public class ReverseEachWord {

    public static void reverseEachWord(String str) {
        
        String ans="";
        String word="";
        for(int i=0;i<str.length();i++){
            
            if(str.charAt(i)==' '){
                ans+=word+" ";
                word="";
            }else{
                word=str.charAt(i)+word;
            }
        }
        ans+=word;

        // another approach
        // String ans="";
        // int currentWordStart=0;
        // int i=0;
        // for(;i<str.length();i++){
        //     if(str.charAt(i)==' '){
        //         int currentWordEnd=i-1;
        //         String reverseWord="";
        //         for(int j=currentWordStart;j<=currentWordEnd;j++){
        //             reverseWord=str.charAt(j)+reverseWord;
        //         }
        //         ans+=reverseWord+" ";
        //         currentWordStart=i+1;
        //     }
        // }
        // int currentWordEnd=i-1;
        // String reverseWord="";
        // for(int j=currentWordStart;j<=currentWordEnd;j++){
        //     reverseWord=str.charAt(j)+reverseWord;
        // }
        // ans+=reverseWord+" ";
        System.out.println(ans);
    }

    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        String str=s.nextLine();
        reverseEachWord(str);
        s.close();
    }
}
