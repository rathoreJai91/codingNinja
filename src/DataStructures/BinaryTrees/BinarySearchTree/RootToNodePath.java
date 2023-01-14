package DataStructures.BinaryTrees.BinarySearchTree;
import java.util.ArrayList;
import DataStructures.BinaryTrees.BinaryTreeNode;

/*
 * Given a BST and an integer k. Find and 
 * return the path from the node with data 
 * k and root (if a node with data k is 
 * present in given BST) in a list. Return 
 * empty list otherwise.
 * Note: Assume that BST contains all unique elements.
*/

public class RootToNodePath {
    
    public static ArrayList<Integer> getPath(BinaryTreeNode<Integer> root , int data){
        if(root==null){
            return null;
        }
        if(root.data==data){
            ArrayList<Integer> output = new ArrayList<>();
            output.add(root.data);
            return output;
        }
        if(root.data>data){
            ArrayList<Integer> leftOutput = getPath(root.left, data);
            if(leftOutput!=null){
                leftOutput.add(root.data);
                return leftOutput;
            }
        }
        if(root.data<data){
            ArrayList<Integer> rightOutput = getPath(root.right, data);
            if(rightOutput!=null){
                rightOutput.add(root.data);
                return rightOutput;
            }
        }
        return null;

    }

}
