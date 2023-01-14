package Strings;

import java.util.Scanner;

public class MinLengthWord {

    public static String minLengthWord(String str) {
        
        String minWord="";
        String currWord="";
        int count=0;
        int min=Integer.MAX_VALUE;
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)==' '){
                if(count<min){
                    min=count;
                    minWord=currWord;
                }
                currWord="";
                count=0;

            }else{
                currWord+=str.charAt(i);
                count++;
            }
        }
        if(count<min){
            minWord=currWord;
        }
        return minWord;

    }

    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        String str=s.nextLine();
        System.out.println(minLengthWord(str));
        s.close();
    }
}
