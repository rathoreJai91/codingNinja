package DataStructures.BinaryTrees.BinarySearchTree;



/*
 * Given a Binary Search Tree and two integers 
 * k1 and k2, find and print the elements which 
 * are in range k1 and k2 (both inclusive).
 * Print the elements in increasing order.
*/

import DataStructures.BinaryTrees.BinaryTreeNode;

public class ElementsInRange {
    
    public static void elementsInRange(BinaryTreeNode<Integer> root , int k1 , int k2){
        if(root==null){
            return;
        }
        if(k1>root.data){
            elementsInRange(root.right, k1, k2);
            return;
        }
        if(k2<root.data){
            elementsInRange(root.left, k1, k2);
            return;
        }
        if(k1<=root.data && k2>=root.data){
            elementsInRange(root.left, k1, k2);
            System.out.println(root.data+" ");
            elementsInRange(root.right, k1, k2);
        }
    }
}
