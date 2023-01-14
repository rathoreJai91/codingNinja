package DataStructures.BinaryTrees.BinarySearchTree;
import DataStructures.LinkedList.Node;
import DataStructures.BinaryTrees.BinaryTreeNode;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class LevelWiseLinkedList {

    public static ArrayList<Node<Integer>> constructLinkedListForEachLevel(BinaryTreeNode<Integer> root){
        if(root==null){
            return null;
        }
        Queue<BinaryTreeNode<Integer>> pendingChild=new LinkedList<>();
        pendingChild.add(root); 
        pendingChild.add(null); 

        ArrayList<Node<Integer>> result = new ArrayList<>();
        Node<Integer> head = null, tail = null; 

        while(!pendingChild.isEmpty()){
            BinaryTreeNode<Integer> front = pendingChild.poll();
            
            if(front!=null){
                Node<Integer> currNode = new Node<Integer>(front.data);
                if(front.left!=null){
                    pendingChild.add(front.left);
                }
                if(front.right!=null){
                    pendingChild.add(front.right);
                }
                if(head==null){
                    head=currNode;
                    tail=head;
                }else{
                    tail.next=currNode;
                    tail=tail.next;
                }
            }else {
                result.add(head);
                head=null;
                tail=null;
                if(!pendingChild.isEmpty()){
                    pendingChild.add(front);
                }
            }
        }
        return result;
    }

}
