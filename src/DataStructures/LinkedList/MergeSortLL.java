package DataStructures.LinkedList;

public class MergeSortLL {

    public static Node<Integer> mergeSort(Node<Integer> head){
        if(head==null || head.next==null){
            return head;
        }
        Node<Integer> head1=head, mid=null, head2=null;
        mid=midPoint(head);
        head2=mid.next;
        mid.next=null;
        head1=mergeSort(head1);
        head2=mergeSort(head2);
        head=merge(head1,head2);
        return head;
    }
    public static Node<Integer> merge(Node<Integer> head1, Node<Integer> head2 ){
        Node<Integer> finalHead=null,tail=null;
        if(head1.data<=head2.data){
            finalHead=head1;
            head1=head1.next;
        }else{
            finalHead=head2;
            head2=head2.next;
        }
        tail=finalHead;
        while(head1!=null && head2!=null){
            if(head1.data<=head2.data){
                tail.next=head1;
                head1=head1.next;
            }else{
                tail.next=head2;
                head2=head2.next;
            }
            tail=tail.next;
        }
        if(head1!=null){
            tail.next=head1;
        }else if(head2!=null){
            tail.next=head2;
        }
        return finalHead;
    }

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
        head=mergeSort(head);
        LinkedListUse.printLL(head);
    }
}
