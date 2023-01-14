package DataStructures.BinaryTrees.BinarySearchTree;
import DataStructures.BinaryTrees.BinaryTreeNode;
public class IsBST {
    
    public static boolean isBST(BinaryTreeNode<Integer> root){
        if(root==null){
            return true;
        }
        int leftMaximum=maximum(root.left);
        if(leftMaximum>=root.data){
            return false;
        }
        int rightMinimum=minimum(root.right);
        if(rightMinimum<root.data){
            return false;
        }
        return isBST(root.left) && isBST(root.right);
    }

    private static int maximum(BinaryTreeNode<Integer> root) {
        if(root==null){
            return Integer.MIN_VALUE;
        }
        return Math.max(root.data,Math.max(maximum(root.left),maximum(root.right)));
    }

    private static int minimum(BinaryTreeNode<Integer> root){
        if(root==null){
            return Integer.MAX_VALUE;
        }
        return Math.min(root.data,Math.min(minimum(root.left),minimum(root.right)));
    }

}
