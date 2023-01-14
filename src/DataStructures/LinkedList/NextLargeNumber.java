package DataStructures.LinkedList;
/*
 Given a large number represented in the form of a linked list. 
 Write code to increment the number by 1 in-place(i.e. without using extra space).
 Note: You don't need to print the elements, just update the elements and return the head of updated LL.
  
 example: input=326 output=327
          input=999 output=1000
 */


public class NextLargeNumber {

    public static Node<Integer> nextLargeNumber(Node<Integer> head){

        // if(head==null){
        //     return head;
        // }
        // if(head.next==null){
        //     head.data+=1;
        //     if(head.data==10){
        //         Node<Integer> newNode=new Node<>(1);
        //         head.data-=10;
        //         newNode.next=head;
        //         return newNode;
        //     }
        //     return head;
        // }
        // //Node<Integer> temp=nextLargeNumber(head.next);
        // if(head.next!=nextLargeNumber(head.next)){
        //     //head.next=temp;
        //     head.data+=1;
        //     if(head.data==10){
        //         Node<Integer> newNode=new Node<>(1);
        //         head.data-=10;
        //         newNode.next=head;
        //         return newNode;
        //     }
        // }
        // return head;

        if(head==null){
        }
        head=reverse(head);
        Node<Integer> temp=head,prev=null;
        int carry=1;

        while(temp!=null){
            temp.data+=carry;
            carry=(temp.data==10)?1:0;
            temp.data%=10;
            prev=temp;
            temp=temp.next;
        }
        if(carry>0){
            Node<Integer> newNode=new Node<>(1);
            prev.next=newNode;
            
        }
        return reverse(head);
    }
    public static Node<Integer> reverse(Node<Integer> head){

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

    public static void main(String[] args) {
        Node<Integer> head=LinkedListUse.takeInput();
        head=nextLargeNumber(head);
        LinkedListUse.printLL(head);
    }
}
