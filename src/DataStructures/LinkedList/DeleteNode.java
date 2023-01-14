package DataStructures.LinkedList;

import java.util.Scanner;

public class DeleteNode {

    public static Node<Integer> deleteNode(Node<Integer> head, int pos){
        if(pos==0){
            head=head.next;
            return head;
        }
        int i=0;
        Node<Integer> currNode=head,prevNode=null;
        while(i<pos && currNode!=null){
            prevNode=currNode;
            currNode=currNode.next;
            i++;
        }
        if(currNode==null){
            return head;
        }
        prevNode.next=currNode.next;
        return head;
    }
    
    public static Node<Integer> deleteR(Node<Integer> head, int pos){

        if(head==null && pos>=0){
            return head;
        }
        if(pos==0){
            head=head.next;
            return head;
        }
        head.next=deleteR(head.next,pos-1);
        return head;
    }

    public static void main(String[] args) {
        Node<Integer> head=LinkedListUse.takeInput();
        Scanner s=new Scanner(System.in);
        int pos=s.nextInt();
        //head=deleteNode(head,pos);
        head=deleteR(head,pos);
        PrintLL.printLL(head);
        s.close();
    }
}
