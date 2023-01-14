package DataStructures.BinaryTrees.BinarySearchTree;

import DataStructures.BinaryTrees.BinaryTreeNode;

/*
 * Given a BST and an integer k. Find if the integer
 * x is present in given BST or not. You have to return 
 * true, if node with data k is present, return false otherwise.
 * Note: Assume that BST contains all unique elements.
*/

public class SearchInBST {
    
    public static boolean searchInBST(BinaryTreeNode<Integer> root , int x){

        if(root==null){
            return false;
        }
        if(root.data==x){
            return true;
        }
        if(x<root.data){
            return searchInBST(root.left, x);
        }
        return searchInBST(root.right, x);    
    }
}
