package DataStructures.Queue;

public class DoubleEnded {
    
    public int[] data;
    private int front; //index of element at the front of the queue
    private int rear;  //index of element at the end of the queue
    private int size;

    public DoubleEnded(int size){
        data=new int[size];
        front=-1;
        rear=-1;
        this.size=0;
    }
    public DoubleEnded(){
        data=new int[10];
        front=-1;
        rear=-1;
        this.size=0;
    }

    public void insertFront(int element){
        if(size==data.length){
            System.out.println(-1);
            return;
        }
        if(front==-1){
            front++;
            data[front]=element;
            rear++;
            size++;
        }else{
            int temp=rear;
            while(temp>=0){
                data[temp+1]=data[temp];
                temp--;
            }
            rear++;
            data[front]=element;
            size++;
        }
    }

    public void insertRear(int element){
        if(size==data.length){
            System.out.println(-1);
            return;
        }
        rear++;
        data[rear]=element;
        size++;
    }

    public void deleteFront(){
        if(size==0){
            System.out.println(-1);
            return;
        }
        for(int i=0;i<data.length-1;i++){
            data[i]=data[i+1];
        }
        rear--;
        size--;
    }

    public void deleteRear(){
        if(size==0){
            System.out.println(-1);
            return;
        }
        rear--;
        size--;
    }

    public int getFront(){
        if(size==0){
            return -1;
        }
        return data[front];
    }

    public int getRear(){
        if(size==0){
            return -1;
        }
        return data[rear];
    }
}
