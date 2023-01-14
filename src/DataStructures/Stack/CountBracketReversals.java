package DataStructures.Stack;

import java.util.Stack;

public class CountBracketReversals {

    public static int countBracketReversals(String str){

        if(str.length()%2!=0){
            return -1;
        }
        int ans=0;
        Stack<Character> s=new Stack<>();
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)=='{'){
                s.push(str.charAt(i));
            }else{
                if(!s.empty()){
                    s.pop();
                }else{
                    s.push('{');
                    ans++;
                }
            }
        }
        if (s.size() % 2 != 0){
            return -1;
        }
        ans += s.size() / 2;
        return ans;
    }
    
    public static void main(String[] args) {
        String str="}}}{{{";
        System.out.println(countBracketReversals(str));
    }
}
