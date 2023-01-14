package DataStructures.Stack;

import DataStructures.LinkedList.Node;

public class StackUsingLL <T> {
    
    private Node<T> head;
    private int size;

    public StackUsingLL(){
        head=null;
        size=0;
    }

    public int size(){
        return size;
    }

    public boolean isEmpty(){
        if(head==null){// if(size==0)
            return true;
        }
        
        return false;
    }

    public void push(T elem){
        Node<T> newNode=new Node<>(elem);
        newNode.next=head;
        head =newNode;
        size++;
    }

    public T top() throws NullPointerException{
        if(head==null){
            throw new NullPointerException();
        }
        return head.data;
    } 

    public T pop() throws NullPointerException{
        if(head==null){
            throw new NullPointerException();
        }

        T remove=head.data;
        head=head.next;
        size--;
        return remove;
    }
}
