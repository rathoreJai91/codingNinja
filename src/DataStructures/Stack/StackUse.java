package DataStructures.Stack;

public class StackUse {
    
    public static void main(String[] args) throws StackFullException, StackEmptyException {
        //StackUsingArray stack=new StackUsingArray();
        //StackUsingLL<Integer> stack=new StackUsingLL<>();
        StackUsingQueue<Integer> stack=new StackUsingQueue<>();
        stack.push(10);
        System.out.println(stack.top());
        System.out.println(stack.size());
        System.out.println(stack.pop()); 
        //System.out.println(stack.pop()); 
        stack.push(30);
        stack.push(20);
        System.out.println(stack.size());
        System.out.println(stack.top());
        System.out.println(stack.isEmpty());

    }
}
