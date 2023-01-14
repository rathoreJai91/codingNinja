package Strings;

import java.util.Scanner;

public class CheckPermutation {

    public static boolean isPermutation(String str1,String str2) {
        
        for(int i=0;i<str1.length();i++){
            int isPresent=0;
            for(int j=0;j<str2.length();j++){
                if(str1.charAt(i)==str2.charAt(j)){
                    isPresent=1;
                    break;
                }
            }
            if(isPresent==0){
                return false;
            }
        }
        // return true;

        //OR

        int sum=0;
        for(int i=0;i<str1.length();i++){
            sum+=str1.charAt(i);
        }
        for(int i=0;i<str2.length();i++){
            sum-=str2.charAt(i);
        }
        if(sum==0){
            return true;
        }else{
            return false;
        }
    }

    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        String str1=s.nextLine();
        String str2=s.nextLine();
        System.out.println(isPermutation(str1,str2));
        s.close();
    }
}
