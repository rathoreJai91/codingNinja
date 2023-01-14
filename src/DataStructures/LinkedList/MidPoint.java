package DataStructures.LinkedList;

public class MidPoint {
    public static Node<Integer> midPoint(Node<Integer> head){

        if(head==null || head.next==null){
            return head;
        }
        
        Node<Integer> fast=head,slow=head,prevSlow=null;
        while(fast!=null && fast.next!=null){
            prevSlow=slow;
            slow=slow.next;
            fast=fast.next.next;
        }
        if(fast==null){
            return prevSlow;
        }else{
            return slow;
        }
    }

    public static void main(String[] args) {
        Node<Integer> head=LinkedListUse.takeInput();
        System.out.println(midPoint(head).data);
    }
}
