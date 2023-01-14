package DataStructures.Queue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class ReverseQueue {
    
    public static void reverseQueue(Queue<Integer> q){
        Stack<Integer> s=new Stack<>();
        while(!q.isEmpty()){
            s.push(q.poll());
        }
        while(!s.isEmpty()){
            q.add(s.pop());
        }
    }

    public static Queue<Integer> reverseQueueR(Queue<Integer> q){
        if(q.isEmpty()){
            return q;
        }
        Integer front=q.poll();
        reverseQueue(q);
        q.add(front);
        return q;
    }

    public static void main(String[] args) {
        Queue<Integer> queue=new LinkedList<>();
        int arr[]={10,20,30,40};

        for(int elem: arr){
            queue.add(elem);
        }
        //reverseQueue(queue);
        reverseQueueR(queue);
        while(!queue.isEmpty()){
            System.out.println(queue.poll());
        }
    }
}
