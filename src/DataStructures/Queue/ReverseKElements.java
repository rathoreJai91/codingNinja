package DataStructures.Queue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;


public class ReverseKElements {

    public static Queue<Integer> reverseKElement(Queue<Integer> q, int k){
        Stack<Integer> s=new Stack<>();

        if(q.isEmpty() || k==0){
            return q;
        }
        for(int i=0;i<k;i++){
            s.push(q.poll());
        }
        while(!s.empty()){
            q.add(s.pop());
        }
        for(int i=0;i<q.size()-k;i++){
            q.add(q.poll());
        }
        return q;
    }
    
    public static void main(String[] args) {
        Queue<Integer> queue=new LinkedList<>();
        int arr[]={10,20,30,40};

        for(int elem: arr){
            queue.add(elem);
        }
        //reverseQueue(queue);
        queue=reverseKElement(queue,2);
        while(!queue.isEmpty()){
            System.out.println(queue.poll());
        }
    }
}
