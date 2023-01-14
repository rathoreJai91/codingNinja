package DataStructures.Queue;

import DataStructures.LinkedList.Node;

public class QueueUsingLinkedList<T> {
    
    private Node<T> front;
    private Node<T> rear;
    private int size;

    //Constructor
    //Ideally we don't need the constructor
    public QueueUsingLinkedList() {
        front = null;
        rear = null;
        size=0;
    }
    
    //Size of Stack(Linked list)
    public int size(){
        return size;
    }

    //Check if the stack is empty or not
    public boolean isEmpty(){
        if(size==0){
            return true;
        }
        return false;
    }

    //Inserting an element into the stack in front of linkedlist
    public void enqueue(T elem){
        Node<T> newNode=new Node<>(elem);
        if(front==null){ 
            front=newNode;
            rear=front;
        }else{
            rear.next=newNode;
            rear=rear.next;
        }
        size++;
    }

    //front element of the LinkedList or top of stack
    public T front() throws QueueEmptyException{
        if(front!=null){
            return front.data;
        }
        throw new QueueEmptyException();
    }

    //Remove a element from thr stack or LL
    public T dequeue() throws QueueEmptyException{
        if(front!=null){
            T temp=front.data;
            front=front.next;
            if(front==null){
                rear=null;
            }
            size--;
            return temp;
        }
        throw new QueueEmptyException();
    }
}
