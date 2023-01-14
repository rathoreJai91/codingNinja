package DataStructures.Queue;

public class QueueUsingArray {
    
    private int data[];
    private int front; //index of element at the front of the queue
    private int rear;  //index of element at the end of the queue
    private int size;

    //default constructor
    public QueueUsingArray(){
        data=new int[3];
        front=-1;
        rear=-1;
    }

    //constructor if user want to set the capacity of the queue
    public QueueUsingArray(int capacity){
        data=new int[capacity];
        front=-1;
        rear=-1;
    }

    //to show the size of the queue
    public int size(){
        return size;
    }

    //To check if the queue is empty or not
    public boolean isEmpty(){
        return size==0;
    }

    //To insert into the queue
    public void enqueue(int element){
        if(size==data.length){
            // 
            doubleCapacity();
        }
        if(size==0){
            front=0;
        }
        // rear++;
        // if(rear==data.length){
        //     rear=0;
        // }
        rear=(rear+1) % data.length;
        data[rear]=element;
        size++;
    }

    // increases the capacity of the queue
    private void doubleCapacity() {
        int temp[]=data;
        data=new int[temp.length*2];
        int index=0;
        for(int i=front;i<temp.length;i++){
            data[index++]=temp[i];
        }
        for(int i=0;i<front-1;i++){
            data[index++]=temp[i];
        }
        front=0;
        rear=temp.length-1;
    }

    //to find the element at the front of the queue
    public int front()throws QueueEmptyException {
        if(size==0){
            throw new QueueEmptyException();
        }
        return data[front];
    }

    // to remove the element from the queue(rear end)
    public int dequeue() throws QueueEmptyException{
        if(size==0){
            throw new QueueEmptyException();
        }
        int temp=data[front];
        front++;
        if(front==data.length){
            front=0;
        }
        size--;
        if(size==0){
            front=-1;
            rear=-1;
        }
        return temp;
    }

}
