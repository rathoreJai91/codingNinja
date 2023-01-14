package DataStructures.LinkedList;

public class EvenAfterOdd {
    
    public static Node<Integer> evenAfterOdd(Node<Integer> head){
        if(head==null || head.next==null){
            return head;
        }
        // Node<Integer> temp=head,oddHead=null,oddTail=null,evenHead=null,evenTail=null;

        // while(temp!=null){
        //     if(temp.data%2!=0){
        //         if(oddHead==null){
        //             oddHead=temp;
        //             oddTail=temp;
        //         }else{
        //             oddTail.next=temp;
        //             oddTail=temp;
        //         }
        //     }else{
        //         if(evenHead==null){
        //             evenHead=temp;
        //             evenTail=temp;
        //         }else{
        //             evenTail.next=temp;
        //             evenTail=temp; 
        //         }
        //     }
        //     temp=temp.next;
        // }
        // oddTail.next=evenHead;
        // evenTail.next=null;
        //return head;

        Node<Integer> even= new Node<>(-1);
        Node<Integer> odd= new Node<>(-1);
        Node<Integer> evenptr=even;
        Node<Integer> oddptr=odd;
        
        Node<Integer> temp=head;
        
        while(temp!=null){
            if((temp.data)%2==0){
                evenptr.next=temp;
                evenptr=evenptr.next;
            }
            else{
                oddptr.next=temp;
                oddptr=oddptr.next;
            }
            temp=temp.next;
        }
        if(odd.next!=null){
            oddptr.next=even.next;
            evenptr.next=null;
            return odd.next;
        }
        return even.next;

    }

    public static void main(String[] args) {
        Node<Integer> head=LinkedListUse.takeInput();
        head=evenAfterOdd(head);
        LinkedListUse.printLL(head);
    }
}
