package DataStructures.LinkedList;

import java.util.Scanner;

public class LinkedListUse {
    
    public static Node<Integer> createLinkedList(){
        Node<Integer> n1= new Node<>(10);
        Node<Integer> n2= new Node<>(20);
        Node<Integer> n3= new Node<>(30);
        Node<Integer> n4= new Node<>(40);

        
        n1.next=n2;
        n2.next=n3;
        n3.next=n4;
        
        return n1;
    }

    public static void printLL(Node<Integer> head) {
        Node<Integer> temp=head;

        while(temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;

        }
    }

    public static void printR(Node<Integer> head){
        if(head==null){
            return;
        }
        printR(head.next);
        System.out.print(head.data+" ");
        
    }

    public static Node<Integer> takeInput() {
        Scanner s=new Scanner(System.in);
        Node<Integer> head=null,tail=null;
        int data=s.nextInt();
        while(data!=-1){
            Node<Integer> currNode=new Node<>(data);
            if(head==null){
                //Make this node as head node
                head=currNode;
                tail=currNode;
            }else{
                //insert at the end and update tail
                tail.next=currNode;
                tail=tail.next; //or tail=currNode;
            }
            data=s.nextInt();
        }
        s.close();
        return head;
    }
    public static void main(String[] args) {
        // Node<String> n1=new Node<>("hello");
        // System.out.println(n1.data);
        // System.out.println(n1.next);

        //Node<Integer> head = createLinkedList();
        Node<Integer> head = takeInput();
        //printLL(head);
        printR(head);        

    }

}
