package DataStructures.LinkedList;

public class PrintIthNode {
    
    public static void printIthNode(Node<Integer> head, int i){
        Node<Integer> temp=head;
        int pos=0;
        while(temp!=null){
            if(pos==i){
                System.out.println(temp.data);
                return;
            }
            temp=temp.next;
        }
        return;
    }
}
