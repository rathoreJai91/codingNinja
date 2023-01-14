package DataStructures.Stack;

import java.util.Stack;

public class CheckRedundantBrackets {
    
    public static boolean checkRedundantBrackets(String str){

        Stack<Character> stack=new Stack<>();
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)!=')'){
                stack.push(str.charAt(i));
            }else{
                int count=0;
                while(stack.peek()!='('){
                    stack.pop();
                    count++;
                }
                if(count==0){
                    return true;
                }
                stack.pop();
            }
        }
        return false;
    }

    public static void main(String[] args) {
        String str="(x+y*(a-b))";
        System.out.println(checkRedundantBrackets(str));
    }
}
