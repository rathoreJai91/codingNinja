package DataStructures.LinkedList;

public class PrintReverse {
 
    public static Node<Integer> printReverse(Node<Integer> head){

        if(head==null || head.next==null){
            return head;
        }
        Node<Integer> prevNode=null,currNode=head,temp=null;
        while(currNode!=null){
            temp=currNode.next;
            currNode.next=prevNode;
            prevNode=currNode;
            currNode=temp;
        }
        head=prevNode;
        return head;
    }

    public static Node<Integer> reverseR(Node<Integer> head){

        if(head==null || head.next==null){
            return head;
        }
        //Node<Integer> rev=reverseR(head.next),temp=rev;

        // while(temp.next!=null){
        //     temp=temp.next;
        // }
        // temp.next=head;
        // head.next=null;

        Node<Integer> rev=reverseR(head.next);
        head.next.next=head;
        head.next=null;
        return rev;
    }

    public static void main(String[] args) {
        Node<Integer> head=LinkedListUse.takeInput();
        //head=printReverse(head);
        head=reverseR(head);
        PrintLL.printLL(head);
    }

}
