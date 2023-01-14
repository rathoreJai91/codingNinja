package DataStructures.BinaryTrees.BinarySearchTree;
import DataStructures.BinaryTrees.BinaryTreeNode;

/*
 * Given a binary search tree, you have to replace each 
 * node's data with the sum of all nodes which are greater 
 * or equal than it. You need to include the current node's data also.
 * That is, if in given BST there is a node with data 5, you need to 
 * replace it with sum of its data (i.e. 5) and all nodes whose data is 
 * greater than or equal to 5.

 * Note: You don't need to return or print, just change the data of each node.
 */

public class ReplaceWithLargerNodesSum {
    
    public static int largerSum(BinaryTreeNode<Integer> root , int sum){
        if(root==null){
            return sum;
        }
        int rightSum=largerSum(root.right, sum);
        root.data+=rightSum;
        int leftSum=largerSum(root.left, root.data);
        return leftSum;
    }

    public static void replaceWithLargerNodesSum(BinaryTreeNode<Integer> root){
        largerSum(root, 0);
    }

}
