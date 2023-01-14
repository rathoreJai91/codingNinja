package DataStructures.LinkedList;

import java.util.Scanner;

public class KReverse {

    public static Node<Integer> kReverse(Node<Integer> head , int k){
        if(head==null || head.next==null){
            return head;
        }
        if(k==0){
            return head;
        }
        Node<Integer> prevNode=null,currNode=head,temp=null;
        int i=k;
        while(currNode!=null && i>0){
            temp=currNode.next;
            currNode.next=prevNode;
            prevNode=currNode;
            currNode=temp;
            i--;
        }
        if(currNode!=null){
            head.next=kReverse(currNode,k);
        }
        head=prevNode;
        return head;

    }
    
    public static void main(String[] args) {
        Node<Integer> head=LinkedListUse.takeInput();
        Scanner s= new Scanner(System.in);
        int k=s.nextInt();
        head=kReverse(head, k);
        LinkedListUse.printLL(head);
        s.close();
    }
}
