package DataStructures.Queue;

public class QueueUse {
    public static void main(String[] args) throws QueueEmptyException {
        
        //QueueUsingArray queue=new QueueUsingArray();
        //QueueUsingLinkedList<Integer> queue=new QueueUsingLinkedList<>();
        QueueUsingStacks<Integer> queue=new QueueUsingStacks<>();

        int arr[]={10,20,30,40};

        for(int elem: arr){
            queue.enqueue(elem);
        }
        System.out.println(queue.size());
        System.out.println(queue.front());
        System.out.println(queue.dequeue());
        System.out.println(queue.size());
        System.out.println(queue.front());

        while(!queue.isEmpty()){
            try {
                System.out.println(queue.dequeue());
            } catch (QueueEmptyException e) {
                
            }
        }

    }
}
