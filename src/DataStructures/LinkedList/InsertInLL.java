package DataStructures.LinkedList;

import java.util.Scanner;

public class InsertInLL {

    public static Node<Integer> insert(Node<Integer> head, int pos, int data) {
        Node<Integer> newNode=new Node<>(data);
        if(pos==0){
            newNode.next=head;
            head=newNode;
            return head;
        }
        int i=0;
        Node<Integer> prevNode=null, currNode=head;
        while(currNode!=null){
            if(pos==i){
                newNode.next=currNode;
                prevNode.next=newNode;
                return head;
            }
            prevNode=currNode;
            currNode=currNode.next;
            i++;
        }
         
        return head;
    }

    public static Node<Integer> insertR(Node<Integer> head, int pos, int elem){
        if(pos==0){
            Node<Integer> newNode=new Node<>(elem);
            newNode.next=head;
            head=newNode;
            return head; 
        }
        if(head==null){
            return head;
        }
        head.next=insertR(head.next, pos-1, elem);
        return head;
    }
    
    public static void main(String[] args) {
        Node<Integer> head=LinkedListUse.takeInput();
        Scanner s=new Scanner(System.in);
        int pos=s.nextInt();
        int data=s.nextInt();
        //head=insert(head,pos,data);
        head=insertR(head,pos,data);
        PrintLL.printLL(head);
        s.close();
    }
}
