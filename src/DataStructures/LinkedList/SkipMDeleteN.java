package DataStructures.LinkedList;

import java.util.Scanner;

public class SkipMDeleteN {

    public static Node<Integer> skipMDeleteN(Node<Integer> head, int M, int N){
        if(head==null){
            return head;
        }
        if(M==0){
            return head=null;
        }
        Node<Integer> temp=head,skip=null,delete=null;
        while(temp!=null){
            int i=M;
            while(i>0 && temp!=null){
                skip=temp;
                delete=temp;
                temp=temp.next;
                i--;
            }
            int j=N;
            while(j>=1 && temp!=null){
                delete=temp;
                temp=temp.next;
                j--;
            }
            if(delete!=null){
                skip.next=delete.next;
                delete=skip;
            }
        }
        return head;
    } 

    public static void main(String[] args) {
        Node<Integer> head=LinkedListUse.takeInput();
        Scanner s=new Scanner(System.in);
        int M=s.nextInt();
        int N=s.nextInt();
        head=skipMDeleteN(head, M, N);
        LinkedListUse.printLL(head);
        s.close();
    }
}
