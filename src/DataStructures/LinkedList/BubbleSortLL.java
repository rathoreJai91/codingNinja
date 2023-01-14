package DataStructures.LinkedList;


public class BubbleSortLL {

    public static Node<Integer> bubbleSortLL(Node<Integer> head){

        if(head==null || head.next==null){
            return head;
        }
        int count=0;
        Node<Integer> temp=head;
        while(temp!=null){
            temp=temp.next;
            count++;
        }
        for(int i=0;i<count;i++){
            Node<Integer> prevNode=null, currNode=head, nextNode=head.next;
            for(int j=0;j<count-i-1;j++){
                if(currNode.data>nextNode.data){
                    if(currNode==head){
                        currNode=swapB(currNode);
                        head=currNode;
                        nextNode=currNode.next;
                    }else{
                        currNode=swap(prevNode,currNode,nextNode);
                        nextNode=currNode.next;
                    }
                }
                prevNode=currNode;
                currNode=nextNode;
                nextNode=nextNode.next;
            }
        }

        return head;
    }

    public static Node<Integer> swap(Node<Integer> prevNode, Node<Integer> currNode, Node<Integer> nextNode) {
        prevNode.next=nextNode;
        currNode.next=nextNode.next;
        nextNode.next=currNode;
        return nextNode;
    }

    public static Node<Integer> swapB(Node<Integer> currNode){
        Node<Integer> p1=currNode.next, p2=p1.next;
        currNode.next=p2;
        p1.next=currNode;
        return p1;

    }

    public static void main(String[] args) {
        Node<Integer> head= LinkedListUse.takeInput();
        head=bubbleSortLL(head);
        LinkedListUse.printLL(head);
    }
}
