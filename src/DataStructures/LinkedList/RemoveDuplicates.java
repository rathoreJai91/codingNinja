package DataStructures.LinkedList;

public class RemoveDuplicates {
    
    public static Node<Integer> removeDuplicates(Node<Integer> head){

        if(head==null){
            return head;
        }
        Node<Integer> prev=head, curr=head.next;

        while(curr!=null){
            if(curr.data==prev.data){
                curr=curr.next;
            }else{
                prev.next=curr;
                prev=curr;
            }
        }
        prev.next=curr;
        return head;
        // if(head==null){
        //     return head;
        // }
        // Node<Integer> curr=head;

        // while(curr!=null){
        //     Node<Integer> temp=curr;

        //     while(temp!=null && temp.data==curr.data){
        //         temp=temp.next;
        //     }
        //     curr.next=temp;
        //     curr=temp;
        // }
        //return head;
    }


    public static void main(String[] args) {
        Node<Integer> head=LinkedListUse.takeInput();
        head=removeDuplicates(head);
        PrintLL.printLL(head);
    }
}
