package Recursion;

public class ReturnKeypad {
    
    private static String getWord(int n){
        if(n==2){
            return "abc";
        }else if(n==3){
            return "def";
        }else if(n==4){
            return "ghi";
        }else if(n==5){
            return "jkl";
        }else if(n==6){
            return "mno";
        }else if(n==7){
            return "pqrs";
        }else if(n==8){
            return "tuv";
        }else if(n==9){
            return "wxyz";
        }
        return "";
    }

    public static String[] keypad(int n){
		// Write your code here
        if(n==0){
            String s[]= new String[1];
            s[0]="";
            return s;
        }
        int remaining=n/10;
        int currDigit=n%10;
        String word = getWord(currDigit);
        String smallOutput[]=keypad(remaining);
        String result[]=new String[smallOutput.length*word.length()];
        if(result.length!=0){
            int k=0;
            for(int i=0;i<word.length();i++){
                for(int j=0;j<smallOutput.length;j++){
                    result[k]=word.charAt(i)+smallOutput[j];
                    k++;
                }
            }
        }   
        return result;
	}
	
    public static void keypad(int n , String stringSoFar){
        if(n==0){
            System.out.println(stringSoFar);
            return;
        }
        int currDigit=n%10;
        String currWord = getWord(currDigit);
        if(currWord.length()==0){
            return;
        }
        for(int i=0;i<currWord.length();i++){
            keypad( n/10, currWord.charAt(i)+stringSoFar);
        }
    }

    public static void main(String[] args) {
        keypad(234,"");
    }
}
