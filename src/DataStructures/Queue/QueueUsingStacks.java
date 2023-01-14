package DataStructures.Queue;

import java.util.Stack;

public class QueueUsingStacks<T> {
    
    Stack<T> s1;
    Stack<T> s2;

    public QueueUsingStacks(){
        s1=new Stack<>();
        s2=new Stack<>();
    }

    public int size(){
        return s1.size();
    }

    public boolean isEmpty(){
        return s1.empty();
    }

    public void enqueue(T elem){
        if(s1.empty()){
            s1.push(elem);
            return;
        }
        while(!s1.empty()){
            s2.push(s1.pop());
        }
        s1.push(elem);
        while(!s2.empty()){
            s1.push(s2.pop());
        }
    }

    public T front() throws QueueEmptyException{
        if(s1.isEmpty()){
            throw new QueueEmptyException();
        }
        return s1.peek();
    }

    public T dequeue() throws QueueEmptyException{
        if(s1.empty()){
            throw new QueueEmptyException();
        }
        return s1.pop();
    }
}
