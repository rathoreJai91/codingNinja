package DataStructures.Stack;

import java.util.Stack;

public class StackCollections {
    
    public static void main(String[] args) {
        Stack<Integer> stack= new Stack<>();

        stack.push(45);
        System.out.println(stack.size());
        System.out.println(stack.peek());
        stack.empty();
    }
}
