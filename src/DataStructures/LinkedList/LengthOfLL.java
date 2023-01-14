package DataStructures.LinkedList;

public class LengthOfLL {
    
    public static int lengthOfLL(Node<Integer> head){
        Node<Integer> temp=head;
        int count=0;
        while(temp.data!=-1){
            count++;
            temp=temp.next;
        }
        return count;
    }
}
