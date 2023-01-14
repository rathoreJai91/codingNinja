package DataStructures.BinaryTrees.BinarySearchTree;
import DataStructures.LinkedList.Node;
import DataStructures.BinaryTrees.BinaryTreeNode;

/*
 * Given a BST, convert it into a sorted linked list. 
 * You have to return the head of LL.
*/

public class BSTToLinkedList {

    public static bstReturn<Integer> constructHelper(BinaryTreeNode<Integer> root){
        if(root==null){
            return null;
        }
        bstReturn<Integer> rootNode= new bstReturn<>(new Node<Integer>(root.data),new Node<Integer>(root.data));
        bstReturn<Integer> leftNode= constructHelper(root.left);
        bstReturn<Integer> rightNode= constructHelper(root.right);

        if(leftNode==null && rightNode==null){
            return rootNode;
        }
        if(rightNode==null){
            leftNode.tail.next=rootNode.head;
            return new bstReturn<>(leftNode.head,rootNode.head);
        }
        if(leftNode==null){
            rootNode.head.next=rightNode.head;
            return new bstReturn<>(rootNode.head, rightNode.tail);
        }
        
        leftNode.tail.next=rootNode.head;
        rootNode.tail.next=rightNode.head;
        return new bstReturn<>(leftNode.head, rightNode.tail);
    }

    public static Node<Integer> constructLinkedList(BinaryTreeNode<Integer> root){
        if(root==null){
            return null;
        }
        Node<Integer> head = constructHelper(root).head;
        return head;
    }

}

class bstReturn<T>{
    Node<T> head;
    Node<T> tail;
    public bstReturn(Node<T> head, Node<T> tail){
        this.head=head;
        this.tail=tail;
    }
}