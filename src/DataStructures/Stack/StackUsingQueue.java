package DataStructures.Stack;

import java.util.LinkedList;
import java.util.Queue;

public class StackUsingQueue<T> {
    
    Queue<T> q1;
    Queue<T> q2;
    public StackUsingQueue(){
        q1=new LinkedList<>();
        q2=new LinkedList<>();
    }

    public int size(){
        return q1.size();
    }
    
    public boolean isEmpty(){
        return q1.isEmpty();
    }

    public void push(T elem){
        while(!q1.isEmpty()){
            q2.add(q1.poll());
        }
        q1.add(elem);
        while(!q2.isEmpty()){
            q1.add(q2.poll());
        }
    }

    public T pop() throws StackEmptyException{
        if(q1.isEmpty()){
            throw new StackEmptyException();
        }
        return q1.poll();
    }

    public T top() throws StackEmptyException{
        if(q1.isEmpty()){
            throw new StackEmptyException();
        }
        return q1.peek();
    }
}
