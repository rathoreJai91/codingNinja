package DataStructures.Stack;

public class StackUsingArray {
    
    private int data[];
    private int topIndex; //Index of the topmost element of the stack 

    public StackUsingArray(){
        data=new int[10];
        topIndex=-1;
    }

    public StackUsingArray(int size){
        data=new int[size];
        topIndex=-1;
    }

    public int size(){
        return topIndex+1;
    }

    public boolean isEmpty(){
        if(topIndex==-1){
            return true;
        }
        return false;
        // OR 
        // return topIndex==-1;
    }

    public void push(int elem) throws StackFullException{
        //check if stack is full
        if(topIndex==data.length-1){
            // //throw an exception
            // // StackFullException e= new StackFullException();
            // // throw e;
            // throw new StackFullException();
            doubleCapacity();
        }
        topIndex++;
        data[topIndex]=elem;
        // data[++topIndex];
    }

    private void doubleCapacity() {
        int temp[]=data;
        data= new int [temp.length*2];
        for(int i=0;i<temp.length;i++){
            data[i]=temp[i];
        }
    }

    public int top() throws StackEmptyException{
        //check if the stack is empty
        if(topIndex==-1){
            //throw exception
            throw new StackEmptyException();
        }
        return data[topIndex];

    }

    public int pop() throws StackEmptyException{
        //check if the stack is empty
        if(topIndex==-1){
            //throw exception
            throw new StackEmptyException();
        }
        topIndex--;
        return data[topIndex+1];
        // return data[topIndex--];
    }
}
