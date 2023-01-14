package DataStructures.LinkedList;

import java.util.Scanner;

public class AppendLastNToFirst {

    public static Node<Integer> appendLastNToFirst(Node<Integer> head, int n){
        int count=0;
        if(n==0 || head==null){
            return head;
        }
        Node<Integer> temp=head, tail=null;
        while(temp!=null){
            count++;
            tail=temp;
            temp=temp.next;
        }
        temp=head;
        for(int i=0;i<count-n-1;i++){
            temp=temp.next;
        }
        tail.next=head;
        head=temp.next;
        temp.next=null;

        return head;
    }

    public static void main(String[] args) {
        Node<Integer> head=LinkedListUse.takeInput();
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        head=appendLastNToFirst(head, n);
        PrintLL.printLL(head);
        s.close();
    }
}
