package DataStructures.Stack;

import java.util.Stack;

public class BracketBalanced {

    public static boolean isBalanced(String str){
        Stack<Character> stack=new Stack<>();
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)=='(' || str.charAt(i)=='{' ){
                stack.push(str.charAt(i));
            }else{
                if(stack.peek()=='(' && str.charAt(i)==')'){
                    stack.pop();
                }else if(stack.peek()=='{' && str.charAt(i)=='}'){
                    stack.pop();
                }else{
                    stack.push(str.charAt(i));
                }
            }
        }
        return stack.empty();
    }

    public static void main(String[] args) {
        String expression="()()(()";
        System.out.println(isBalanced(expression));
    }
}
