package DataStructures.LinkedList;

import java.util.Scanner;

public class FindNode {

    public static int findNode(Node<Integer> head, int n){
        
        Node<Integer> temp=head;
        int i=0;
        while(temp!=null){
            if(temp.data==n){
                return i;
            }
            temp=temp.next;
            i++;
        }
        return -1;
    }

    public static int findNodeR(Node<Integer> head, int n){
        if(head==null){
            return -1;
        }
        if(head.data==n){
            return 0;
        }
        int temp=findNodeR(head.next, n);
        if(temp==-1){
            return temp;
        }else{
            return temp+1;
        }   
    }


    public static void main(String[] args) {
        
        Node<Integer> head=LinkedListUse.takeInput();
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        //System.out.println(findNode(head, n));
        System.out.println(findNodeR(head, n));
        s.close();
    }
}
