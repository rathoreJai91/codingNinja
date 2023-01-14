package DataStructures.LinkedList;

public class MergeTwoSortedLL {
    
    public static Node<Integer> mergeSortedLL(Node<Integer> head1, Node<Integer> head2 ){
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

    public static void main(String[] args) {
        Node<Integer> head1=LinkedListUse.takeInput();
        Node<Integer> head2=LinkedListUse.takeInput();
        Node<Integer> finalHead=mergeSortedLL(head1, head2);
        LinkedListUse.printLL(finalHead);
    }
}
