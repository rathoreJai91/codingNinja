package DataStructures.LinkedList;

public class RemoveAlternate {
    
    public static void deleteAlternateNodes(Node<Integer> head){
        if(head==null || head.next==null){
            return;
        }
        Node<Integer> temp=head; //prev=head;
        // while(temp!=null && temp.next!=null){
        //     prev.next=temp.next;
        //     prev=temp.next;
        //     temp=prev.next;
        // }

        while(temp!=null && temp.next!=null){
            temp.next=temp.next.next;
            temp=temp.next;
        }
        
    }

    public static void main(String[] args) {
        Node<Integer> head=LinkedListUse.takeInput();
        deleteAlternateNodes(head);
        LinkedListUse.printLL(head);
    }
}
