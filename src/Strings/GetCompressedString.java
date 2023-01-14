package Strings;

import java.util.Scanner;

public class GetCompressedString {

    public static String getCompressedString (String str) {
        
        String compressed="";
        int i=0;
        int j=1;
        int count=1;
        while(i<str.length()-1){
            if(str.charAt(i)!=str.charAt(j) && count>1){
                compressed+=str.charAt(i)+""+count;
                count=1;
            }else if(str.charAt(i)!=str.charAt(j) && count==1){
                compressed+=str.charAt(i);
            }else if(str.charAt(i)==str.charAt(j)){
                count++;
            }
            i++;
            j++;

        }
        compressed+=str.charAt(i);
        if(count!=1){
            compressed+=count;
        }

        return compressed;
    }

    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        String str=s.nextLine();

        System.out.println(getCompressedString(str));
        s.close();
    }
}
