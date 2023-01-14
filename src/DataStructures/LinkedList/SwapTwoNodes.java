package DataStructures.LinkedList;

import java.util.Scanner;

public class SwapTwoNodes {

    public static Node<Integer> swapTwoNodes(Node<Integer> head, int i, int j) {
        if(head == null || i==j){
            return head;
        }
        int n=Math.max(i, j);
        Node<Integer> temp=head;
        Node<Integer> prev1=null , prev2=null , curr1=head , curr2=head;
        while(temp!=null && n!=0){
            if(i!=0){
                prev1=curr1;
                curr1=curr1.next;
                i--;
            }
            if(j!=0){
                prev2=curr2;
                curr2=curr2.next;
                j--;
            }
            n--;
            temp=temp.next;
        }
        if(temp==null){
            return head;
        }
        Node<Integer> temp2=curr2.next;
        prev1.next=curr2;
        prev2.next=curr1;
        curr2.next=curr1.next;
        curr1.next=temp2;
        return head;
    }

    public static void main(String[] args) {
        Node<Integer> head=LinkedListUse.takeInput();
        Scanner s=new Scanner(System.in);
        int i=s.nextInt();
        int j=s.nextInt();
        head=swapTwoNodes(head, i, j);
        LinkedListUse.printLL(head);
        s.close();
    }
}
